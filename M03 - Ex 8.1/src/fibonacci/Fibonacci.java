/**
 * 
 */
package fibonacci;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		// Creates the integer list with a size of 25
		List<Integer> fibonacci = new ArrayList<>(25);
		// Sets the values of positions 0 and 1
		fibonacci.add(0, 0);
		fibonacci.add(1, 1);
		// Fills the list with the corresponding fibonacci numbers
		for ( int i = 2 ; i <= 25 ; i++ ){
			fibonacci.add(i, fibonacci.get(i-1) + fibonacci.get(i-2));
		}
		// Prints the list's numbers using a for loop
		System.out.println("******FOR LOOP******");
		for ( int i = 2 ; i <= 25 ; i++ ){
			System.out.println("Element #" + i + " = " + fibonacci.get(i));
		}
		// Prints the list's numbers using a for each loop
		System.out.println("********************\n\n******FOR EACH******");
		for (Integer number : fibonacci) {
			System.out.println(number);
		}
		// Prints the list's numbers using an iterator
		System.out.println("********************\n\n******ITERATOR******");
		Iterator<Integer> iterator = fibonacci.iterator();
		while(iterator.hasNext())  {
		   System.out.println(iterator.next());
		}
		System.out.println("********************\n");
		// Prints a line showing the position of the number 2584
		System.out.println("Number 2584 is in the position: " + fibonacci.indexOf(2584));
		// Prints a line returning a boolean for the number 4311 being in the array or not
		System.out.println("The number 4311 is present in the array? " + fibonacci.contains(4311));
	}

}
