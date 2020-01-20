package Files;

import java.io.BufferedReader;
import java.io.File;
import  java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\Files\\barca.text");

		try (BufferedReader bf = new BufferedReader(new FileReader(file))) {

			String line;
			while ((line = bf.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("cant read the file");
			e.printStackTrace();
		}

	}

}
