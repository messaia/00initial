/**
 * 
 */
package car;

import java.util.Comparator;

/**
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 *
 */
public class EngDispComparator implements Comparator<Car> {
	// Creates and overrides the comparator
	@Override
	// Checks two car objects
    public int compare(Car car1, Car car2) {
		// Compares the engine displacement of both cars
        if (car1.getEngDisplacement() < car2.getEngDisplacement()) {
            return -1;
        } else if (car1.getEngDisplacement() > car2.getEngDisplacement()) {
            return 1;
        } else {
        	return 0;
        }
    }
}