package car;

import java.util.Scanner;

public class M0801 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Car car = new Car();
//		System.out.println("Introdueix la marca del cotxe:");
//		car.setMarca(sc.next());
//		System.out.println("Introdueix el model del cotxe:");
//		car.setModel(sc.next());
//		System.out.println("Introdueix el nombre de cilindres:");
//		car.setNombre_cilindres(sc.nextInt());
//		System.out.println("Introdueix la cilindrada:");
//		car.setCilindrada(sc.nextInt());
//		sc.close();
//		car.setPotencia_fiscal();
//		System.out.println("El " + car.getMarca() + " " + car.getModel() + " té " + car.getPotencia_fiscal() + " cavalls fiscals.");
		
		Scanner sc = new Scanner(System.in);
		HybridCar car = new HybridCar();
		System.out.println("Introdueix la marca del cotxe:");
		car.setMarca(sc.next());
		System.out.println("Introdueix el model del cotxe:");
		car.setModel(sc.next());
		System.out.println("Introdueix el nombre de cilindres:");
		car.setNombre_cilindres(sc.nextInt());
		System.out.println("Introdueix la cilindrada:");
		car.setCilindrada(sc.nextInt());
		System.out.println("Introdueix la potencia del motor elèctric:");
		car.setkW(sc.nextInt());
		sc.close();
		car.setPotencia_fiscal();
		System.out.println("El " + car.getMarca() + " " + car.getModel() + " té " + car.getPotencia_fiscal() + " cavalls fiscals.");
	}
}
