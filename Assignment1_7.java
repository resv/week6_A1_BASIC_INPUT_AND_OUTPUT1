/*	WEEK 6 ASSIGNMENT 1 - BASIC INPUT AND OUTPUT 1
 * 	BASIC INPUT AND OUTPUT EXERCISE 1
 * 	7.Write a Java program to find the longest word in a text file.
 * 
 */

//		---------------------------------------------------------------------------------------------------

package week6_A1_BASIC_INPUT_AND_OUTPUT1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment1_7 {

	public static void main(String[] args) throws IOException {

		// INSTANCIATE SCANNER, ASSIGN FILE CLASS "readin" TO A FILE LOCATION
		Scanner scanner = null;
		File readin = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
				+ "\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\File6_1_7.txt");

		// INSTANCIATE BUFFERED READER
		BufferedReader bufferStream = null;
		FileReader inputStream = null; // INSTANCIATE FILE READER TO READ FILE WHICH WILL BE PLACED INSIDE THE
										// "bufferStream

		// ASSIGN JAVAIO
		try {
			inputStream = new FileReader(readin);
			bufferStream = new BufferedReader(inputStream);
			scanner = new Scanner(bufferStream);
		//INITIALIZE VARIABLES WE USE AS A CHAR COUNTER AND TEMP STRING HOLDER
			int counter = 0;
			String largest = null;
			
			// USING WHILE LOOP TO CONTINUE IF THERE IS A NEXT LINE
			while (scanner.hasNextLine()) {
				//ADD NEXT STRING INTO DATA ARRAY AND SPLIT ANY OF THESE SPECIFIC CHARS + SPACE
				String[] data = scanner.nextLine().split("[!.?:\\/() ]");
				for (int i = 0; i < data.length; i++) {	//FOR LOOP TO COMPARE LENGTH OF WORD
					if (i > counter) {	//IF WORD IS BIGGER THAN COUNTER AND LAST WORD WE REPLACE THE NEW WORD
						counter = i;
						largest = data[i];
					}
				}
			}
			System.out.println("\"" + largest + "\"" + " is the largest word found in the file!"); // PRINT OUT LARGEST WORD INTO CONSOLE

		} finally {
			if (scanner != null) {
				scanner.close(); // CLOSES SCANNER
			}
			if (inputStream != null) {
				inputStream.close(); // CLOSES SCANNER
			}
			if (bufferStream != null) {
				bufferStream.close(); // CLOSES SCANNER
			}
		}
	}
}
