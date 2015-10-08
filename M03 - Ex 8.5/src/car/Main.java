/**
 * 
 */
package car;

import java.util.HashSet;
import java.util.Iterator;


/**
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 *
 */
public class Main {

	public static void main(String[] args) {
		// Creates a list of cars
		HashSet<Car> cars = new HashSet<Car>();
		// Adds cars to the set
		cars.add(new Car("Alfa Romeo","Giulia",2900,6));
		Car daciaSandero = new Car("Dacia","Sandero",1200,4);
		cars.add(daciaSandero);
		cars.add(new Car("Ford","Focus",2000,4));
		cars.add(new Car("Opel","Insignia",2200,4));
		Car ibiza = new Car("Seat","Ibiza",1600,4);
		cars.add(ibiza);
		// Prints if the queried car is in the set
		System.out.println("\nDoes this set contain a Dacia Sandero? " + cars.contains(daciaSandero));

		// While there are cars on the iterator, do
		
		boolean elimina = cars.remove(ibiza); 
		if (elimina) {
			cars.add(new Car("Seat","Mii",1000,3));
		}
		
		// Adds more cars
		cars.add(new Car("Hyundai","Atos",1500,3));
		// Attempt to add a duplicate car
		if (cars.add(new Car("Ford","Focus",2000,4))){
			System.out.println("Yes, it is possible to add duplicates, as they ocupy different memory spaces.");
		} else 	{
			System.out.println("A duplicate value wasn't added");
		}
		
		// Can't add a car to position 1
		// cars.add(1,new Car("Audi","A8",4600,8));
		// Can't replaces a car in position 4
		// Creates a car iterator
		Iterator<Car> carIterator = cars.iterator();
		while (carIterator.hasNext()){
			// Stores current car
			Car car = carIterator.next();
			// Check if the current car is the same as the queried car
			if (car.equals(daciaSandero)){
				// If true, prints the horsepower of the car
				System.out.printf("The Dacia Sandero has a fiscal horsepower of: %.2f\n\n", car.getFiscalHorsepower());
			}
		}
		
		
		//cars.set(4, new Car("Seat","Mii",1000,3));
		System.out.println("It's not possible to either add or replace elements in a HashSet.\n");
		// Prints the list using an iterator
		System.out.println("*************************ITERATOR*************************");
		Iterator<Car> iterator = cars.iterator();
		while(iterator.hasNext())  {
			Car car = iterator.next();
			System.out.println(car.getBrand() + "\t" + car.getModel() + "\t" + car.getNCylinders() + "\t" + car.getEngDisplacement() + "\t" + car.getFiscalHorsepower());
		}
		System.out.println("**********************************************************\n");
		System.out.println("The printed list is not ordered.\n");
	}
}