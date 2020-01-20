package Files;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class LesFichiers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File file = new File("C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\Files\\barca.text");
		try {
			@SuppressWarnings("unused")
			FileReader fileReader = new FileReader(file);
			System.out.println(fileReader);
		} catch (FileNotFoundException e) {

			System.err.println("File NOT found -> " + e.getMessage());
			e.printStackTrace();
		}
	}

}
