package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
	public static void main(String[] args) throws FileNotFoundException {

		String filename = "C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\Files\\barca.text";
		File file = new File(filename);
		Scanner in = new Scanner(file);

		while (in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(line);
		}

		in.close();
	}

}
