/**
 * 
 */
package car;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 *
 */
public class Main {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>(5);
		cars.add(new Car("Alfa Romeo","Giulia",2900,6));
		cars.add(new Car("Dacia","Sandero",1200,4));
		cars.add(new Car("Ford","Focus",2000,4));
		cars.add(new Car("Opel","Insignia",2200,4));
		cars.add(new Car("Seat","Ibiza",1600,4));
		System.out.printf("The car in position 2 has a fiscal horsepower of: %.2f", cars.get(2).getFiscalHorsepower());
	}

}
