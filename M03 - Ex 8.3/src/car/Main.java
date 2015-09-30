/**
 * 
 */
package car;

import java.util.LinkedList;


/**
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 *
 */
public class Main {

	public static void main(String[] args) {
		LinkedList<Car> cars = new LinkedList<Car>();
		cars.offer(new Car("Alfa Romeo","Giulia",2900,6));
		cars.offer(new Car("Dacia","Sandero",1200,4));
		cars.offer(new Car("Ford","Focus",2000,4));
		cars.offer(new Car("Opel","Insignia",2200,4));
		cars.offer(new Car("Seat","Ibiza",1600,4));
		Car hyundai = new Car("Hyundai","Atos",1500,3);
		cars.offerFirst(hyundai);
		cars.offer(new Car("Ford","Focus",2000,4));
		cars.offer(new Car("Ford","Focus",2000,4));
		System.out.println("Yes, it is possible to add duplicates.");
		cars.add(1,new Car("Audi","A8",4600,8));
		System.out.println("Yes, it is possible to add a car in position 1.");
		cars.set(4, new Car("Seat","Mii",1000,3));
		cars.poll();
		System.out.println("The position of the Hyundai is " + cars.indexOf(hyundai) + ", it's not present as we deleted it.");
		System.out.println("\n*************************FINAL LIST*************************");
		for ( int i = 0 ; i < cars.size() ; i++ ){
			System.out.println(cars.get(i).getBrand() + "\t" + cars.get(i).getModel() + "\t" + cars.get(i).getNCylinders() + "\t" + cars.get(i).getEngDisplacement() + "\t" + cars.get(i).getFiscalHorsepower());
		}
		System.out.println("*************************************************************\n\n");
	}
}