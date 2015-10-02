/**
 * 
 */
package car;

import java.util.LinkedHashSet;
import java.util.Iterator;


/**
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 *
 */
public class Main {

	public static void main(String[] args) {
		// Creates a list of cars
		LinkedHashSet<Car> cars = new LinkedHashSet<Car>();
		// Adds cars to the set
		cars.add(new Car("Alfa Romeo","Giulia",2900,6));
		cars.add(new Car("Dacia","Sandero",1200,4));
		cars.add(new Car("Ford","Focus",2000,4));
		cars.add(new Car("Opel","Insignia",2200,4));
		cars.add(new Car("Seat","Ibiza",1600,4));
		cars.add(new Car("Hyundai","Atos",1500,3));
		cars.add(new Car("Ford","Focus",2000,4));
		System.out.println("\nNo, it's not possible to add duplicates.\n");
		// Prints the list using an iterator
		System.out.println("*************************ITERATOR*************************");
		Iterator<Car> iterator = cars.iterator();
		while(iterator.hasNext())  {
			Car car = iterator.next();
			System.out.println(car.getBrand() + "\t" + car.getModel() + "\t" + car.getNCylinders() + "\t" + car.getEngDisplacement() + "\t" + car.getFiscalHorsepower());
		}
		System.out.println("**********************************************************\n");
		System.out.println("\nThe printed list is ordered by the order we added the cars, so it's a FIFO list.\n");
	}
}