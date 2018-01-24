package Files;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseFileScanner {
	
	public static void main(String[] args) {

		Scanner data; // Character input stream for reading data.
		PrintWriter result; // Character output stream for writing data.

		ArrayList<Double> numbers; // An ArrayList for holding the data.

		numbers = new ArrayList<Double>();

		try { // Create the input stream.
			data = new Scanner(new File("C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\Files\\data.text"));
		} catch (FileNotFoundException e) {
			System.out.println(System.getProperty("C:\\\\Users\\\\morga\\\\Documents\\\\LEARN-JAVA\\\\JavaIntermediaire\\\\src\\\\Files\\\\data.text"));
			System.out.println("Can't find a file named data.text!");
			return; // End the program by returning from main().
		}

		try { // Create the output stream.
			result = new PrintWriter(new FileWriter("C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\Files\\result.text"));
		} catch (IOException e) {
			System.out.println("Can't open file result.text!");
			System.out.println("Error: " + e);
			data.close(); // Close the input file.
			return; // End the program.
		}

		while (data.hasNextDouble()) { // Read until end-of-file.
			double inputNumber = data.nextDouble();
			numbers.add(inputNumber);
		}

		// Output the numbers in reverse order.

		for (int i = numbers.size() - 1; i >= 0; i--)
			result.println(numbers.get(i));

		System.out.println("Done!");

		data.close();
		result.close();

	} // end of main()

}// end class ReverseFileWithScanne
