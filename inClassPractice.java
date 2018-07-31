package week6_A1_BASIC_INPUT_AND_OUTPUT1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class inClassPractice {

	public static void main(String[] args) throws IOException {

		
//		File readin = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\testing.txt");
//		File writeTo = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\testingto.txt");
		FileReader inputStream = new FileReader("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\testing.txt");
		FileWriter outputStream = new FileWriter("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\testingto.txt");		
		BufferedReader bufferStream= new BufferedReader(inputStream);
		PrintWriter printStream = new PrintWriter(outputStream);
		
		
		try {
//		FileReader inputStream = new FileReader("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\testing.txt"););
//		FileWriter outputStream = new FileWriter("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\testingto.txt"););
//		BufferedReader bufferStream= new BufferedReader(inputStream);
//		PrintWriter printStream = new PrintWriter(outputStream);
		
		String l;
		int lineCounter = 0;
		while((l = bufferStream.readLine()) != null){
			printStream.println(l);
			lineCounter++;
			String word= bufferStream.readLine().split(" ");
		}

		System.out.println(word);
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
