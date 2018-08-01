/*	WEEK 6 ASSIGNMENT 1 - BASIC INPUT AND OUTPUT 1
 * 	BASIC INPUT AND OUTPUT EXERCISE 1
 * 	4.Write a Java program to write and read a plain text file.
 * 
 */

		
//		---------------------------------------------------------------------------------------------------
			


package week6_A1_BASIC_INPUT_AND_OUTPUT1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Assignment6_1_4 {

	public static void main(String[] args) throws IOException {

		//I FOUND OUT I CAN SHORTEN THE INITIALIZATION BY INSERTING THE ADDRESS DIRECTLY INTO THE FILE/WRITE READERS
//		File readin = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\testing.txt");
//		File writeTo = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\testingto.txt");
		
		// INSTANCIATE SCANNER, ASSIGN FILE CLASS "readin" TO A FILE LOCATION
		FileReader inputStream = new FileReader("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
															+ "\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\File6_1_4..1txt");
		FileWriter outputStream = new FileWriter("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
															+ "\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\File6_1_4.2.txt");		
		BufferedReader bufferStream= new BufferedReader(inputStream);
		PrintWriter printStream = new PrintWriter(outputStream);
		
		//INITIALIZE STRING "data"
		String data;
		
		//ASSIGN JAVAIO
		try {
		while((data = bufferStream.readLine()) != null){ // ASSIGN "data" AS THE BUFFER STREAM WHICH GRABS NEXT LINE AND MAKES SURE THERE IS ACTUAL DATA
			printStream.println(data);	//PRINT THE DATA TO THE FILE
		}
		//MSG TO USER TO NOTIFY THAT READ FROM FILE File6_1_4.1 WAS SUCCESFUL INTO WRITING TO File6_1_4.2
		System.out.println("File6_1_4.1 is vacant with random chars");
		System.out.println("File6_1_4.1 has been read and copied to File6_1_4.2");
		System.out.println("To retest this, just erase data from File6_1_4.2 and re-run this java application");
		
	}	finally {
			if(inputStream != null) {
				inputStream.close();
			}
			if(outputStream !=null) {
				outputStream.close();
			}
			if(bufferStream != null) {
				bufferStream.close();
			}
			if(printStream != null) {
				printStream.close();
			}
		}
	}
}
