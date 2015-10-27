
package exceptions;

/**
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 */

public class ExceptionTreatment {
	public static void main(String[] args) {
		int[] test = {23,4,2015};
		try {
			test[1] = test[3];
		} catch (Exception exception) {
			System.out.println("Catch program execution");
			System.out.println(exception.getMessage());
			System.out.println(exception.getCause());
			//exception.printStackTrace();
		} finally {
			System.out.println("Finally code");
		}
		System.out.println("Program ended with an error!");
	}
}
