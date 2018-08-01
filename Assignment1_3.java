/*	WEEK 6 ASSIGNMENT 1 - BASIC INPUT AND OUTPUT 1
 * 	BASIC INPUT AND OUTPUT EXERCISE 1
 * 	3.Write a Java program to store text file content line by line into an array.
 * 
 */

//		---------------------------------------------------------------------------------------------------

package week6_A1_BASIC_INPUT_AND_OUTPUT1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1_3 {

	public static void main(String[] args) throws IOException {

		// INSTANCIATE SCANNER, ASSIGN FILE CLASS "readin" TO A FILE LOCATION
		Scanner scanner = null;
		File readin = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
												+ "\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\File6_1_3.txt");
		
		// INSTANCIATE BUFFERED READER BECAUSE WE WILL BE READING ENTIRE LINES
		BufferedReader bufferStream = null;
		FileReader inputStream = null; // INSTANCIATE FILE READER TO READ FILE WHICH WILL BE PLACED INSIDE THE
										// "bufferStream"

		// INSTANCIATE ARRAYLIST
		List<String> arr = new ArrayList<>();

		//ASSIGN JAVAIO
		try {
			inputStream = new FileReader(readin);
			bufferStream = new BufferedReader(inputStream);
			scanner = new Scanner(bufferStream);
			
		// USING WHILE LOOP TO CONTINUE IF THERE IS A NEXT LINE
			while (scanner.hasNextLine()) {
				arr.add("\r\n" + scanner.nextLine() + "\r\n");	//ADD THE NEXT LINE INTO LIST ARRAY "arr"
			}
			System.out.println(arr); // PRINT OUT ARR FROM FILE TO CONSOLE
			
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
