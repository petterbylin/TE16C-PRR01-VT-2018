package lessons.readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scannerFile {

	/**
	 * This method does the following: <br>
	 * 1. Creates an new Scanner based on a new File at a given path. <br>
	 * 2. As long as the Scanner has a line to read; read it as a String. <br>
	 * 
	 * @throws FileNotFoundException
	 *             If there is no file at the given path.
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// 1
		final String PATH = "v3/lessons/readfile/";
		Scanner fileReader = new Scanner(new File(PATH + "exampleFile.txt"));

		// 2
		while (fileReader.hasNextLine()) {
			String line = fileReader.nextLine();
			// Do whatever you want with your line of data
			
		}

	}

}