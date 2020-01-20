package Files;

public class Main {

	public static void main(String[] args) {

		String test = "abc-def-123";
		String[] output = test.split("-");

		
		for (int a = 0; a < output.length; a++) {
			System.out.println(output[a]);	
		}
		
		
		
			int r = 0;
			for (int i = 1; i < 3; i++) {
				for (int j = 1; j < i; j++) {
					for (int k = j; k < i + j; k++) {
						r++;
					}
				}
			}
			// System.out.println(r);
		}
	}

