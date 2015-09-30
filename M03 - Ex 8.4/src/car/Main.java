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
		
		PriorityQueue<Car> carsPriorityQueue = new PriorityQueue<Car>();
		carsPriorityQueue.offer(new Car("Alfa Romeo","Giulia",2900,6));
		carsPriorityQueue.offer(new Car("Dacia","Sandero",1200,4));
		carsPriorityQueue.offer(new Car("Ford","Focus",2000,4));
		carsPriorityQueue.offer(new Car("Opel","Insignia",2200,4));
		carsPriorityQueue.offer(new Car("Seat","Ibiza",1600,4));
		carsPriorityQueue.offer(new Car("Hyundai","Atos",1500,3));
	}
}