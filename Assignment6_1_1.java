/*	WEEK 6 ASSIGNMENT 1 - BASIC INPUT AND OUTPUT 1
 * 	BASIC INPUT AND OUTPUT EXERCISE 1
 * 	1.Write a Java program to read a file content line by line.
 * 
 */

		
//		---------------------------------------------------------------------------------------------------
		


package week6_A1_BASIC_INPUT_AND_OUTPUT1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment6_1_1 {

	public static void main(String[] args) throws IOException {
		
		//INSTANCIATE SCANNER, ASSIGN "readin" TO A FILE LOCATION
		Scanner scanner = null;
		File readin = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
												+ "\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\File6_1_1.txt");
		//INSTANCIATE BUFFERED READER BECAUSE WE WILL BE READING ENTIRE LINES
		BufferedReader bufferStream = null; 
		FileReader inputStream = null; //INSTANCIATE FILE READER TO READ FILE WHICH WILL BE PLACED INSIDE THE "bufferStream"
		
		//ASSIGN JAVAIO
		try {
			inputStream = new FileReader(readin);
			bufferStream = new BufferedReader(inputStream);
			scanner = new Scanner(bufferStream);	//ADDING A SCANNER TO BUFFER STREAM
			
			
			//USING WHILE LOOP TO COMMAND SCANNER TO CONTINUE IF THERE IS WORD/LINE
			while (scanner.hasNext()) {	
				System.out.println(scanner.nextLine());	// TELL SCANNER TO PRINT TO CONSOLE
			}
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
