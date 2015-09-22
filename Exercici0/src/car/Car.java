package car;

public class Car {

	String marca;
	String model;
	int nombre_cilindres;
	int cilindrada;
	double potencia_fiscal;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNombre_cilindres() {
		return nombre_cilindres;
	}
	public void setNombre_cilindres(int nombre_cilindres) {
		this.nombre_cilindres = nombre_cilindres;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public double getPotencia_fiscal() {
		return potencia_fiscal;
	}
	public void setPotencia_fiscal() {
		this.potencia_fiscal = 0.08 * this.nombre_cilindres * Math.pow((this.cilindrada / this.nombre_cilindres), 0.6);
	}

}
