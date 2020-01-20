package Files;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseFileScanner {
	
	public static void main(String[] args) {

		Scanner data; 
		PrintWriter result; 

		ArrayList<Double> numbers; 

		numbers = new ArrayList<Double>();

		try { 
			data = new Scanner(new File("C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\Files\\data.text"));
		} catch (FileNotFoundException e) {
			System.out.println(System.getProperty("C:\\\\Users\\\\morga\\\\Documents\\\\LEARN-JAVA\\\\JavaIntermediaire\\\\src\\\\Files\\\\data.text"));
			System.out.println("Can't find a file named data.text!");
			return; 
		}

		try { 
			result = new PrintWriter(new FileWriter("C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\Files\\result.text"));
		} catch (IOException e) {
			System.out.println("Can't open file result.text!");
			System.out.println("Error: " + e);
			data.close(); 
			return; 
		}

		while (data.hasNextDouble()) { 
			double inputNumber = data.nextDouble();
			numbers.add(inputNumber);
		}

		

		for (int i = numbers.size() - 1; i >= 0; i--)
			result.println(numbers.get(i));

		System.out.println("Done!");

		data.close();
		result.close();

	} 

}
