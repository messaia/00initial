package car;

public class HybridCar extends Car{
	int kW;

	public int getkW() {
		return kW;
	}

	public void setkW(int kW) {
		this.kW = kW;
	}
	
	public void setPotencia_fiscal() {
		this.potencia_fiscal = 0.08 * this.nombre_cilindres * Math.pow((this.cilindrada / this.nombre_cilindres), 0.6) * (this.kW / 200.0);
	}
}
