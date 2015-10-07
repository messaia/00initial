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
	// HashCode generation override
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + engDisplacement;
		long temp;
		temp = Double.doubleToLongBits(fiscalHorsepower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + nCylinders;
		return result;
	}
	//Equality override
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (engDisplacement != other.engDisplacement)
			return false;
		if (Double.doubleToLongBits(fiscalHorsepower) != Double.doubleToLongBits(other.fiscalHorsepower))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (nCylinders != other.nCylinders)
			return false;
		return true;
	}
}