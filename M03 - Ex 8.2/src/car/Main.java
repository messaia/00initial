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
		System.out.printf("The car in position 2 has a fiscal horsepower of: %.2f\n", cars.get(2).getFiscalHorsepower());
		cars.add(new Car("Hyundai","Atos",1500,3));
		cars.add(new Car("Ford","Focus",2000,4));
		cars.add(new Car("Ford","Focus",2000,4));
		System.out.println("Yes, it is possible to add duplicates.");
		cars.add(1,new Car("Audi","A8",4600,8));
		System.out.println("Yes, it is possible to add a car in position 1.");
		cars.set(4, new Car("Seat","Mii",1000,3));
		int counter = 0;
		for (Car car : cars) {
			if (car.getBrand().equals("Ford") && car.getModel().equals("Focus")) {
				System.out.println("The car Ford Focus is in position: " + counter + "\n\n");
			}
			counter++;
		}
		System.out.println("*************************FOR LOOP*************************");
		for ( int i = 0 ; i < cars.size() ; i++ ){
			System.out.println(cars.get(i).getBrand() + "\t" + cars.get(i).getModel() + "\t" + cars.get(i).getNCylinders() + "\t" + cars.get(i).getEngDisplacement() + "\t" + cars.get(i).getFiscalHorsepower());
		}
		System.out.println("**********************************************************\n\n");
		System.out.println("*************************FOR EACH*************************");
		for ( Car car : cars ){
			System.out.println(car.getBrand() + "\t" + car.getModel() + "\t" + car.getNCylinders() + "\t" + car.getEngDisplacement() + "\t" + car.getFiscalHorsepower());
		}
		System.out.println("**********************************************************\n\n");
		System.out.println("*************************ITERATOR*************************");
		Iterator<Car> iterator = cars.iterator();
		while(iterator.hasNext())  {
			Car car = iterator.next();
			System.out.println(car.getBrand() + "\t" + car.getModel() + "\t" + car.getNCylinders() + "\t" + car.getEngDisplacement() + "\t" + car.getFiscalHorsepower());
		}
		System.out.println("**********************************************************\n\n");
	}
}