/**
 * 
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 *
 */
package exceptions;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		function();
	}
	
	public static void function() {
		FileOutputStream file;
		try {
			file = new FileOutputStream ("/docs/test.txt");
			try {
				file.close();
			} catch (IOException exception) {
				System.out.println("Program execution error. File could not be closed.");
			}
		} catch (FileNotFoundException exception) {
			System.out.println("Program execution error. File was not found.");
		}
		
		// The compiler doesn't tell anything about SecurityException because the file doesn't exist and its permissions can't be checked.
		
		// As the exception was caught, the program can continue running regardless, and so the compiler doesn't crash
		
	}
}
