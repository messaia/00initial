/**
 * 
 */
package car;

import java.util.TreeSet;
import java.util.Comparator;

/**
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 *
 */
public class Main {

	public static void main(String[] args) {
		// Creates a list of cars with an engine displacement comparator
		TreeSet<Car> engDisplacementOrderedSetA = new TreeSet<Car>(
				new Comparator<Car>() {
					@Override
					// Compares the engine displacement of both cars
					public int compare(Car car1, Car car2) {
						if (car1.getEngDisplacement() < car2.getEngDisplacement()) {
							return -1;
						} else if (car1.getEngDisplacement() > car2.getEngDisplacement()) {
							return 1;
						} else {
							return 1;
						}
					}
				});
		// Adds cars to the set
		engDisplacementOrderedSetA.add(new Car("Alfa Romeo","Giulia",2900,6));
		engDisplacementOrderedSetA.add(new Car("Dacia","Sandero",1200,4));
		engDisplacementOrderedSetA.add(new Car("Ford","Focus",2000,4));
		engDisplacementOrderedSetA.add(new Car("Opel","Insignia",2200,4));
		engDisplacementOrderedSetA.add(new Car("Seat","Ibiza",1600,4));
		engDisplacementOrderedSetA.add(new Car("Hyundai","Atos",1500,3));
		// Creates a list of cars with a fiscal horsepower comparator
		TreeSet<Car> fiscalHorsepowerOrderedSetA = new TreeSet<Car>(
				new Comparator<Car>() {
					@Override
					// Compares the fiscal horsepower of both cars
					public int compare(Car car1, Car car2) {
						if (car1.getFiscalHorsepower() < car2.getFiscalHorsepower()) {
							return -1;
						} else if (car1.getFiscalHorsepower() > car2.getFiscalHorsepower()) {
							return 1;
						} else {
							return 0;
						}
					}
				});
		// Adds cars to the set
		fiscalHorsepowerOrderedSetA.add(new Car("Alfa Romeo","Giulia",2900,6));
		fiscalHorsepowerOrderedSetA.add(new Car("Dacia","Sandero",1200,4));
		fiscalHorsepowerOrderedSetA.add(new Car("Ford","Focus",2000,4));
		fiscalHorsepowerOrderedSetA.add(new Car("Opel","Insignia",2200,4));
		fiscalHorsepowerOrderedSetA.add(new Car("Seat","Ibiza",1600,4));
		fiscalHorsepowerOrderedSetA.add(new Car("Hyundai","Atos",1500,3));
		
		// Creates two more duplicate lists
		TreeSet<Car> engDisplacementOrderedSetB = new TreeSet<Car>(
				new Comparator<Car>() {
					@Override
					public int compare(Car car1, Car car2) {
						if (car1.getEngDisplacement() < car2.getEngDisplacement()) {
							return -1;
						} else if (car1.getEngDisplacement() > car2.getEngDisplacement()) {
							return 1;
						} else {
							return 1;
						}
					}
				});
		engDisplacementOrderedSetB.add(new Car("Alfa Romeo","Giulia",2900,6));
		engDisplacementOrderedSetB.add(new Car("Dacia","Sandero",1200,4));
		engDisplacementOrderedSetB.add(new Car("Ford","Focus",2000,4));
		engDisplacementOrderedSetB.add(new Car("Opel","Insignia",2200,4));
		engDisplacementOrderedSetB.add(new Car("Seat","Ibiza",1600,4));
		engDisplacementOrderedSetB.add(new Car("Hyundai","Atos",1500,3));
		
		TreeSet<Car> fiscalHorsepowerOrderedSetB = new TreeSet<Car>(
				new Comparator<Car>() {
					@Override
					public int compare(Car car1, Car car2) {
						if (car1.getFiscalHorsepower() < car2.getFiscalHorsepower()) {
							return -1;
						} else if (car1.getFiscalHorsepower() > car2.getFiscalHorsepower()) {
							return 1;
						} else {
							return 0;
						}
					}
				});
		fiscalHorsepowerOrderedSetB.add(new Car("Alfa Romeo","Giulia",2900,6));
		fiscalHorsepowerOrderedSetB.add(new Car("Dacia","Sandero",1200,4));
		fiscalHorsepowerOrderedSetB.add(new Car("Ford","Focus",2000,4));
		fiscalHorsepowerOrderedSetB.add(new Car("Opel","Insignia",2200,4));
		fiscalHorsepowerOrderedSetB.add(new Car("Seat","Ibiza",1600,4));
		fiscalHorsepowerOrderedSetB.add(new Car("Hyundai","Atos",1500,3));
		
		// Prints the engDisplacementOrderedSetA list using a LIFO method, taking the last car each time
		System.out.println("\n************************LIFO engDisplacementOrderedSet LIST************************");
		while(true) {
			 Car currentCar = engDisplacementOrderedSetA.pollFirst();
			 if(currentCar == null) {
				 break;
			 }
			 System.out.println(currentCar.getBrand() + "\t" + currentCar.getModel() + "\t" + currentCar.getNCylinders() + "\t" + currentCar.getEngDisplacement() + "\t" + currentCar.getFiscalHorsepower());
		}
		System.out.println("************************************************************************************\n");

		System.out.println("************************************************************************************\n");

		// Prints the fiscalHorsepowerOrderedSetA list using a LIFOmethod, taking the last car each time
		System.out.println("\n************************LIFO fiscalHorsepowerOrderedSet LIST************************");
		while(true) {
			 Car currentCar = fiscalHorsepowerOrderedSetA.pollFirst();
			 if(currentCar == null) {
				 break;
			 }
			 System.out.println(currentCar.getBrand() + "\t" + currentCar.getModel() + "\t" + currentCar.getNCylinders() + "\t" + currentCar.getEngDisplacement() + "\t" + currentCar.getFiscalHorsepower());
		}
		System.out.println("************************************************************************************\n");
		

		// Prints the engDisplacementOrderedSetB list using a FIFO method, taking the last car each time
		System.out.println("\n************************FIFO engDisplacementOrderedSet LIST************************");
		while(true) {
			 Car currentCar = engDisplacementOrderedSetB.pollLast();
			 if(currentCar == null) {
				 break;
			 }
			 System.out.println(currentCar.getBrand() + "\t" + currentCar.getModel() + "\t" + currentCar.getNCylinders() + "\t" + currentCar.getEngDisplacement() + "\t" + currentCar.getFiscalHorsepower());
		}
		System.out.println("************************************************************************************\n");

		System.out.println("************************************************************************************\n");

		// Prints the fiscalHorsepowerOrderedSetB list using a FIFO method, taking the last car each time
		System.out.println("\n************************FIFO fiscalHorsepowerOrderedSet LIST************************");
		while(true) {
			 Car currentCar = fiscalHorsepowerOrderedSetB.pollLast();
			 if(currentCar == null) {
				 break;
			 }
			 System.out.println(currentCar.getBrand() + "\t" + currentCar.getModel() + "\t" + currentCar.getNCylinders() + "\t" + currentCar.getEngDisplacement() + "\t" + currentCar.getFiscalHorsepower());
		}
		System.out.println("************************************************************************************\n");
	}
}