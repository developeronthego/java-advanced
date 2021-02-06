package advanced.lesson8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NullpointerCatch {

	private static final String FILENAME = "somefile.txt";

	public static void main(String [] args) throws IOException, WrongExtensionException {
		fileFacade();
	}

	private static void fileFacade() throws IOException, WrongExtensionException {
		FileReader file = null;
		try {
			file = new FileReader("c:\\" + FILENAME);

		} catch (FileNotFoundException e) {
			if (!isCorrectFileName(FILENAME)) {
		        throw new WrongExtensionException("Incorrect file extension.");
		    }
		} 
	}

	private static boolean isCorrectFileName(String fileName) {
		String[] fileNameParts = fileName.split("\\.");
		for (int i = 0; i < fileNameParts.length; i++) {
			System.err.println(fileName);
		}
		String extension = fileNameParts[1];
		if (extension == "xml") {
			return true;
		}
		return false;
	}
}
