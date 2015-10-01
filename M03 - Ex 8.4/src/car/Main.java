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
		LinkedList<Car> lifoAutos = new LinkedList<Car>();
		lifoAutos.offer(new Car("Alfa Romeo","Giulia",2900,6));
		lifoAutos.offer(new Car("Dacia","Sandero",1200,4));
		lifoAutos.offer(new Car("Ford","Focus",2000,4));
		lifoAutos.offer(new Car("Opel","Insignia",2200,4));
		lifoAutos.offer(new Car("Seat","Ibiza",1600,4));
		lifoAutos.offer(new Car("Hyundai","Atos",1500,3));
		
		LinkedList<Car> fifoAutos = new LinkedList<Car>();
		fifoAutos.offer(new Car("Alfa Romeo","Giulia",2900,6));
		fifoAutos.offer(new Car("Dacia","Sandero",1200,4));
		fifoAutos.offer(new Car("Ford","Focus",2000,4));
		fifoAutos.offer(new Car("Opel","Insignia",2200,4));
		fifoAutos.offer(new Car("Seat","Ibiza",1600,4));
		fifoAutos.offer(new Car("Hyundai","Atos",1500,3));
		
		Comparator<Car> comparator = new EngDispComparator();
		PriorityQueue<Car> carsPriorityQueue = new PriorityQueue<Car>(6,comparator);
		carsPriorityQueue.offer(new Car("Alfa Romeo","Giulia",2900,6));
		carsPriorityQueue.offer(new Car("Dacia","Sandero",1200,4));
		carsPriorityQueue.offer(new Car("Ford","Focus",2000,4));
		carsPriorityQueue.offer(new Car("Opel","Insignia",2200,4));
		carsPriorityQueue.offer(new Car("Seat","Ibiza",1600,4));
		carsPriorityQueue.offer(new Car("Hyundai","Atos",1500,3));
		
		System.out.println("\n*******PRIORITY QUEUE ORDERED BY ENGINE DISPLACEMENT*******");
		while(true) {
			 Car currentCar = carsPriorityQueue.poll();
			 if(currentCar == null) {
				 break;
			 }
			 System.out.println(currentCar.getBrand() + "\t" + currentCar.getModel() + "\t" + currentCar.getNCylinders() + "\t" + currentCar.getEngDisplacement() + "\t" + currentCar.getFiscalHorsepower());
		}
		System.out.println("***********************************************************\n");
		
		lifoAutos.offer(new Car("Fiat","Panda",900,2));
		fifoAutos.offer(new Car("Fiat","Panda",900,2));
		carsPriorityQueue.offer(new Car("Fiat","Panda",900,2));
		
		System.out.println("\n************************LIFO LIST************************");
		while(true) {
			 Car currentCar = lifoAutos.pollFirst();
			 if(currentCar == null) {
				 break;
			 }
			 System.out.println(currentCar.getBrand() + "\t" + currentCar.getModel() + "\t" + currentCar.getNCylinders() + "\t" + currentCar.getEngDisplacement() + "\t" + currentCar.getFiscalHorsepower());
		}
		System.out.println("***********************************************************\n");
		
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