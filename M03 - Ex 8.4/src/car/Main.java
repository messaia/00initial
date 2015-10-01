/**
 * 
 */
package car;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Comparator;

/**
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 *
 */
public class Main {

	public static void main(String[] args) {
		// Creates a linked list that will be a LIFO list
		LinkedList<Car> lifoAutos = new LinkedList<Car>();
		lifoAutos.offerLast(new Car("Alfa Romeo","Giulia",2900,6));
		lifoAutos.offerLast(new Car("Dacia","Sandero",1200,4));
		lifoAutos.offerLast(new Car("Ford","Focus",2000,4));
		lifoAutos.offerLast(new Car("Opel","Insignia",2200,4));
		lifoAutos.offerLast(new Car("Seat","Ibiza",1600,4));
		lifoAutos.offerLast(new Car("Hyundai","Atos",1500,3));

		// Creates a linked list that will be a FIFO list
		LinkedList<Car> fifoAutos = new LinkedList<Car>();
		fifoAutos.offerFirst(new Car("Alfa Romeo","Giulia",2900,6));
		fifoAutos.offerFirst(new Car("Dacia","Sandero",1200,4));
		fifoAutos.offerFirst(new Car("Ford","Focus",2000,4));
		fifoAutos.offerFirst(new Car("Opel","Insignia",2200,4));
		fifoAutos.offerFirst(new Car("Seat","Ibiza",1600,4));
		fifoAutos.offerFirst(new Car("Hyundai","Atos",1500,3));
		
		// Creates a car comparator using the overriden class
		Comparator<Car> comparator = new EngDispComparator();
		// Creates a priority queue
		PriorityQueue<Car> carsPriorityQueue = new PriorityQueue<Car>(6,comparator);
		// Adds cars to the priority queu
		carsPriorityQueue.offer(new Car("Alfa Romeo","Giulia",2900,6));
		carsPriorityQueue.offer(new Car("Dacia","Sandero",1200,4));
		carsPriorityQueue.offer(new Car("Ford","Focus",2000,4));
		carsPriorityQueue.offer(new Car("Opel","Insignia",2200,4));
		carsPriorityQueue.offer(new Car("Seat","Ibiza",1600,4));
		carsPriorityQueue.offer(new Car("Hyundai","Atos",1500,3));
		
		// Prints the irority queu, already ordered thanks to the comparator
		System.out.println("\n*******PRIORITY QUEUE ORDERED BY ENGINE DISPLACEMENT*******");
		while(true) {
			 Car currentCar = carsPriorityQueue.poll();
			 if(currentCar == null) {
				 break;
			 }
			 System.out.println(currentCar.getBrand() + "\t" + currentCar.getModel() + "\t" + currentCar.getNCylinders() + "\t" + currentCar.getEngDisplacement() + "\t" + currentCar.getFiscalHorsepower());
		}
		System.out.println("***********************************************************\n");
		
		// Adds a new car to all of the lists
		lifoAutos.offerLast(new Car("Fiat","Panda",900,2));
		fifoAutos.offerFirst(new Car("Fiat","Panda",900,2));
		carsPriorityQueue.offer(new Car("Fiat","Panda",900,2));
		
		// Prints the LIFO list, taking the first car each time
		System.out.println("\n************************LIFO LIST************************");
		while(true) {
			 Car currentCar = lifoAutos.pollFirst();
			 if(currentCar == null) {
				 break;
			 }
			 System.out.println(currentCar.getBrand() + "\t" + currentCar.getModel() + "\t" + currentCar.getNCylinders() + "\t" + currentCar.getEngDisplacement() + "\t" + currentCar.getFiscalHorsepower());
		}
		System.out.println("***********************************************************\n");
		
		// Prints the FIFO list, taking the last car each time
		System.out.println("\n************************FIFO LIST************************");
		while(true) {
			 Car currentCar = fifoAutos.pollLast();
			 if(currentCar == null) {
				 break;
			 }
			 System.out.println(currentCar.getBrand() + "\t" + currentCar.getModel() + "\t" + currentCar.getNCylinders() + "\t" + currentCar.getEngDisplacement() + "\t" + currentCar.getFiscalHorsepower());
		}
		System.out.println("***********************************************************\n");
	}
	
	/*
	Exemples en la vida real:
	LLISTA LIFO: La llista d'espera de pacients per a ser atesos per un metge en una consulta mèdica.
	LLISTA FIFO: Els missatges de veu d'un contestador automàtic que es reprodueixen de més nou a més vell.
	*/
	
}