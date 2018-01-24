package JavaInte;

import java.io.IOException;
import java.util.Scanner;

import mcq.AssessmentForm;
import mcq.AssessmentFormLoader;
import mcq.Choice;
import mcq.Question;
import util.PRNG;

public final class AssessmentFormConsole {

	public static int correct, wrong;
	public static Scanner in = new Scanner(System.in);
	public static Question[] questions;
	public static Rating rating;
	public static boolean isValidRating = true;

	/*
	 * @post set the main logic of this program
	 */
	public static void main(String[] args) throws IOException {
		
		setQuestions();
		randomize();
		setRating();
		
		if (isValidRating) {
			evaluate();
			printResult();
		}

		in.close();
	}

	/*
	 * @pre a file called "QCM.txt" must exist in the same directory as this program
	 * 
	 * @post set the questions in an array
	 */
	public static void setQuestions() {
		String filename = "C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\JavaInte\\QCM.txt";
		AssessmentForm mcq = AssessmentFormLoader.buildQuestionnaire(filename);
		 questions = mcq.getQuestions();
	}


	/*
	 * @ post randomize questions 
	 */
	public static void randomize() {
		for (int i = questions.length - 1; i > 0; i--) {
			int index = PRNG.getGenerator().nextInt(i + 1);
			Question temp = questions[index];
			questions[index] = questions[i];
			questions[i] = temp;
		}
	}

	/*
	 * print rating methods and set the rating method asked to the user
	 */
	public static void setRating() {
		System.out.println("Entrez votre mode de cotation");
		for (int i = 0; i < Rating.values().length; i++) {
			System.out.println("\t[" + i + "]\t" + Rating.values()[i].name().toLowerCase());
		}

		try {
			rating = Rating.values()[in.nextInt()];
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Entrez un mode de cotation qui existe et relancez le programme !");
			isValidRating = false;
		}
	}

	/*
	 * print choices return the entered int
	 */
	public static int getAnswer(Question q) {
		System.out.println(q.getWording());
		Choice[] choices = q.getChoices();
		for (int i = 0; i < choices.length; i++) {
			Choice choice = choices[i];
			System.out.println("\t[" + i + "]\t" + choice);
		}
		System.out.println("Entrez votre réponse");
		return in.nextInt();
	}

	/*
	 * evaluate results and print the answer
	 */
	public static void evaluate() {
		for (int i = 0; i < questions.length; i++) {
			Question q = questions[i];
			if (q.isCorrectChoice(getAnswer(q))) {
				correct++;
				System.out.println("Vrai");
				printLine();
			} else if (rating == Rating.PENALTY) {
				wrong++;
				System.out.println("Faux");
				printLine();
			} else {
				System.out.println("Faux");
				printLine();
			}
		}
	}

	/*
	 * print results at the end in terms of the chosen rating method
	 */
	public static void printResult() {

		double percentage = (double) correct / (double) questions.length * 100;
		int p = (int) Math.round(percentage);

		String scale = "Vous avez eu " + correct + "/" + questions.length + " : vs etes nul";
		String percent = "Vous avez eu " + p + '%';
		String distinction = "Vous avez obtenu : " + Distinction.getDistinction(p);
		String penalty = "Vous avez " + correct + " bonne reponses et " + wrong + " mauvaises reponses sur "
				+ questions.length;
		switch (rating) {
		case ALL:
			System.out.println(scale);
			System.out.println(percent);
			System.out.println(penalty);
			System.out.println(distinction);
			break;
		case PENALTY:
			System.out.println(penalty);
			break;
		case PERCENTAGE:
			System.out.println(percent);
			break;
		case SCALE:
			System.out.println(scale);
			break;
		case DISTINCTION:
			System.out.println(distinction);
			break;
		}
	}

	/*
	 * print a separator
	 */
	public static void printLine() {
		System.out.println("***********************");
	}

	/*
	 * enum of every rating system
	 */
	enum Rating {
		PERCENTAGE, SCALE, PENALTY, DISTINCTION, ALL
	}

	/*
	 * enum of every distinction
	 */
	enum Distinction {

		LA_PLUS_GRANDE_DISTINCTION(86), GRANDE_DISTINCTION(78), DISTINCTION(68), SATISFACTION(60), AJOURNE(0);

		int min;

		Distinction(int min) {
			this.min = min;
		}

		/*
		 * return Distinction given the percent
		 */
		public static Distinction getDistinction(int percent) {
			for (int i = 0; i < Distinction.values().length; i++) {
				if (percent > Distinction.values()[i].min)
					return Distinction.values()[i];
			}
			return Distinction.AJOURNE;
		}

		/*
		 * return a friendly name
		 */
		public String toString() {
			return this.name().toLowerCase().replace('_', ' ');
		}

	}

}
