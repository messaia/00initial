/**
 * 
 */
package car;

/**
 * @author Alpaca King (miquel.luque.rodriguez@gmail.com)
 *
 */
public class Car {

	// Attributes
	String brand;
	String model;
	int nCylinders;
	int engDisplacement;
	double fiscalHorsepower;
	
	// Getter and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String marca) {
		this.brand = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNCylinders() {
		return nCylinders;
	}
	public void setNCylinders(int nombre_cilindres) {
		this.nCylinders = nombre_cilindres;
	}
	public int getEngDisplacement() {
		return engDisplacement;
	}
	public void getEngDisplacement(int cilindrada) {
		this.engDisplacement = cilindrada;
	}
	public double getFiscalHorsepower() {
		return fiscalHorsepower;
	}
	// This calculates the fiscal horsepower of the car
	public void setFiscalHorsepower() {
		this.fiscalHorsepower = 0.08 * this.nCylinders * Math.pow((this.engDisplacement / this.nCylinders), 0.6);
	}
	// The default constructor
	public Car(String brand, String model, int nCylinders, int engDisplacement) {
		this.brand = brand;
		this.model = model;
		this.nCylinders = nCylinders;
		this.engDisplacement = engDisplacement;
		this.fiscalHorsepower = 0.08 * (double)this.nCylinders * Math.pow(((double)this.engDisplacement / (double)this.nCylinders), 0.6);
	}
}