/**
 * 
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 * @date Oct 27, 2015
 * @version 1.0
 *
 */

package exceptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write the first number:");
		int numerator = scanner.nextInt();
		System.out.println("Write the second number:");
		int divisor = scanner.nextInt();
		try {
			System.out.println("Result: " + division(numerator,divisor));
		} catch (ArithmeticException exception) {
			System.out.println("ERROR! Cannot divide by zero.");
		}
		scanner.close();
	}
	
	public static int division(int numerator, int divisor) throws ArithmeticException {
		if ( divisor == 0 ) {
			throw new ArithmeticException();
		} else {
			return numerator / divisor;
		}
	}
}