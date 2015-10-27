/**
 * 
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 * @date Oct 27, 2015
 * @version 0.1
 *
 */

/**
 *
 */
public class Main {

	public static void main(String[] args) {
		Persona person = new Persona();
		try {
			person.setEdat(-1);
		} catch ( IllegalArgumentException exception ){
			System.out.println("Error. A person can't have negative age.");
		}
	}
}