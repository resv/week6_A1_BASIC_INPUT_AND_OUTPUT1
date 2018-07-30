package week6_A1_BASIC_INPUT_AND_OUTPUT1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class inClassPracticeJavaIO {

	public static void main(String[] args) throws IOException {

		
//		File readin = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\testing.txt");
//		File writeTo = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\testingto.txt");
		FileReader inputStream = new FileReader("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\addingColumns.csv");
		FileWriter outputStream = new FileWriter("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\addingColumnsOutput");		
		BufferedReader bufferStream= new BufferedReader(inputStream);
		PrintWriter printStream = new PrintWriter(outputStream);
//		Scanner s = null;
		
		try {
		Scanner l = new Scanner(bufferStream);
		int col1 = 0;
		int col2 = 0;
		int col3 = 0;
		
		while(l.hasNextLine()){
		String n = l.nextLine();
			String[] values = n.split(",");
			col1 += Integer.parseInt(values[0]);
			col2 += Integer.parseInt(values[1]);
			col3 += Integer.parseInt(values[2]);
		}
		
		printStream.println(col1 + "," + col2 + ","+ col3);
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
