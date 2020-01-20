package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BufferReaders {
	public static void main(String[] args) {

		File file = new File("C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\Files\\barfca.text");

		try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
			String line;
			int count = 0;
			while ((line = bf.readLine()) != null) {
				count++;
				System.out.println(line);
				System.out.println(count);
			}
			System.out.println(count);

		} catch (FileNotFoundException e) {
			System.err.println("Can't read the file :" + "\n" + e.getMessage());
		} catch (IOException e) {
			System.out.println("cant");
		}

		/*
		 * finally { try { if(bf != null) bf.close(); } catch (IOException e) {
		 * System.err.println("Problem trying to close the file"); }
		 */

		/*
		 * catch (NullPointerException e) { System.out.println();
		 * System.out.println("bf remained null"); e.printStackTrace(); }
		 */
	}

}
