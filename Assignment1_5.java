/*	WEEK 6 ASSIGNMENT 1 - BASIC INPUT AND OUTPUT 1
 * 	BASIC INPUT AND OUTPUT EXERCISE 1
 * 	5.Write a Java program to append text to an existing file.
 * 
 */

		
//		---------------------------------------------------------------------------------------------------
			


package week6_A1_BASIC_INPUT_AND_OUTPUT1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Assignment1_5 {

	public static void main(String[] args) throws IOException {

		
		File readin = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
												+ "\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\File6_1_5readin.txt");
		File writeTo = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
												+ "\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\File6_1_5writeTo.txt");
		

		
//		*********//IMPORTANT************ TAKE NOTE THAT FILE WRITER HAS AN ADDITIONAL PARAMETER
//		TO APPEND TO ANOTHER FILE (TRUE) WHILE FALSE WOULD BE TO RECREATE FILE
		FileReader inputStream = new FileReader(readin);
		FileWriter outputStream = new FileWriter(writeTo,true);		
		BufferedReader bufferStream= new BufferedReader(inputStream);
		PrintWriter printStream = new PrintWriter(outputStream);
		
		//INITIALIZE STRING "data"
		String data;
		
		//ASSIGN JAVAIO
		try {
		while((data = bufferStream.readLine()) != null){ // ASSIGN "data" AS THE BUFFER STREAM WHICH GRABS NEXT LINE AND MAKES SURE THERE IS ACTUAL DATA
			printStream.println(data);	//APPENDS THE DATA TO THE FILE
		}
		//MSG TO USER TO NOTIFY THAT READ FROM FILE File6_1_5readin WAS SUCCESFUL INTO WRITING TO File6_1_5writeTo
		System.out.println("Question #5 requirement has been satisfied");
		System.out.println(readin.getName() + " is vacant with a quote");
		System.out.println(readin.getName()  + " has been read and appended to " + writeTo.getName());
		System.out.println("To retest this, re-run + " + writeTo.getName()  + " and you will see additional appended data");
		
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
