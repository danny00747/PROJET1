package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriters {

	public static void main(String[] args) {

		write("C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\Files\\barca2.text", 5);
	}

	public static void write(String filename, int n) {

		File file = new File(filename);

		try (BufferedWriter bf = new BufferedWriter(new FileWriter(file))) {

			
					
					bf.write("hkfffds" );
					bf.newLine();
				
				
			
		} catch (IOException e) {
			System.out.println("cant read the file");
			e.printStackTrace();
		}
	}
}
