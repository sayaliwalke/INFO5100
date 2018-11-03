package Question2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ParseMethod {
	public static void parse(File file) throws IOException {
		RandomAccessFile input = null;
		String line = null;
		try {
			input = new RandomAccessFile(file, "r");
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			return;
		} catch (Exception e) {
			System.out.println("Error found" + e.getMessage());
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/Home-Seattle/Desktop/abc.txt");
		file.createNewFile();
		ParseMethod check = new ParseMethod();
		check.parse(file);

	}

}
