
package car;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 *
 */
public class Main {

	public static void main(String[] args) {
		// Creates a map of type Car with a key
		Map <String,Car>unsortedCarMap = new HashMap<String,Car>();
		// Adds cars to the map
		unsortedCarMap.put("1234 AAA", new Car("Alfa Romeo","Giulia",2900,6));
		unsortedCarMap.put("2321 BBB", new Car("Seat","Ibiza",1200,3));
		unsortedCarMap.put("8232 FFF", new Car("Ford","Focus",2000,4));
		unsortedCarMap.put("3311 FFF", new Car("Ford","Mondeo",2200,4));
		unsortedCarMap.put("9381 LLL", new Car("Seat","Leon",1600,4));
		unsortedCarMap.put("9011 BXC", new Car("Hyundai","Atos",1500,3));
		unsortedCarMap.put("9234 BHG", new Car("Hyundai","Santa Fe",3000,6));
		unsortedCarMap.put("9216 CKK", new Car("Hyundai","Accent",2000,4));
		// It's possible to add duplicates, as long as the key is different
		unsortedCarMap.put("9216 MXV", new Car("Hyundai","Accent",2000,4));
		// Creates a new map that will be sorted
		Map <String,Car>sortedCarMap = new TreeMap<String,Car>();
		// Adds all of the unsorted map's elements to the sorted one, sorting them automatically my key
		sortedCarMap.putAll(unsortedCarMap);
		// Calls the method to print the map
		printMap(sortedCarMap);
	}
	
	public static void printMap(Map <String,Car>map) {
		// Creates a loop that goes through each of the map's cars
		for (Map.Entry<String,Car> entry : map.entrySet()) {
			// Prints the car's license plate (Map key) and all the car's information
			System.out.println("License plate: " + entry.getKey() + "   Car: " + entry.getValue().getBrand() + "\t" + entry.getValue().getModel() + "\t" + entry.getValue().getNCylinders() + "\t" + entry.getValue().getEngDisplacement() + "\t" + entry.getValue().getFiscalHorsepower());
		}
	}
}