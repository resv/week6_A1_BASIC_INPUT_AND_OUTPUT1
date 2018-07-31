/*WEEK 6 ASSIGNMENT 1 - BASIC INPUT AND OUTPUT 1
	BASIC INPUT AND OUTPUT EXERCISE 1
	1.Write a Java program to read a file content line by line.
	2.Write a java program to read a file line by line and store it into a variable.
	3.Write a Java program to store text file content line by line into an array.
	4.Write a Java program to write and read a plain text file.
	5.Write a Java program to append text to an existing file.
	6.Write a Java program to read first 3 lines from a file.
	7.Write a Java program to find the longest word in a text file.
*/

package week6_A1_BASIC_INPUT_AND_OUTPUT1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Questions1to7 {

	public static void main(String[] args) {

		File readIn = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
				+ "\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\testing.txt");
		File writeTo = new File("C:\\Users\\akim4\\Google Drive\\CODE\\JAVAPROGRAMS\\PERSCHOLAS PLATFORM JD WORKSPACE"
				+ "\\src\\week6_A1_BASIC_INPUT_AND_OUTPUT1\\FILE_BANK\\testingto.txt");

		FileReader inputStream = new FileReader(readIn);
		FileWriter outputStream = new FileWriter(writeTo);
		BufferedReader bufferStream = new BufferedReader(inputStream);
		PrintWriter printStream = new PrintWriter(outputStream);
		Scanner = null;

		// 1.Write a Java program to read a file content line by line.
		Scanner scanner = null;
		Scanner scanner = new Scanner(bufferStream);
		
	}

}
