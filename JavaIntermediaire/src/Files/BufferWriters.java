package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriters {

	public static void main(String[] args) {

		write("C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\Files\\barca5.text", 5);
	}

	public static void write(String filename, int n) {

		File file = new File(filename);

		try (BufferedWriter bf = new BufferedWriter(new FileWriter(file))) {

			bf.write("hello");
			bf.newLine();
			bf.write("hello");
		

		} catch (IOException e) {
			System.out.println("cant read the file");
			e.printStackTrace();
		}
	}
}
