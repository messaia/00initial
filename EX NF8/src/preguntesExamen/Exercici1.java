/* 
 * Examen pràctic M02 UF 8
 * 
 * Alumne: Miquel Luque Rodriguez
 * DNI: 47893936R
 * 
 */

package preguntesExamen;

import java.util.LinkedList;

// Exercici 1 (2 punts)
// Crea una estructura dinàmica de dades que emmagatzemi amb una cua LIFO i una cua FIFO
// els animals que estan esperant a ser atesos pel veterinari.
// Simula el bucle d'atenció als animals.
// L'ordre és el mateix que el de l'estructura inicial.
// 1 punt: creació de la bona estructura
// 0,5 punt: bucle FIFO
// 0,5 punt: bucle LIFO

public class Exercici1 {

	public static void main(String[] args) {

		// Declares both lists
		
		LinkedList<Animal> lifoAnimalList = new LinkedList<Animal>();
		LinkedList<Animal> fifoAnimalList = new LinkedList<Animal>();

		// Adds a bunch of animals to both lists, already ordering them as they come in
		
		lifoAnimalList.offerLast(new Animal(32, "frisona", 412.3, 4, 2.71));
		lifoAnimalList.offerLast(new Animal(22, "frisona", 472.3, 4, 2.71));
		lifoAnimalList.offerLast(new Animal(82, "pirineu", 422.1, 4, 2.91));
		lifoAnimalList.offerLast(new Animal(51, "pirineu", 438.1, 4, 2.91));
		lifoAnimalList.offerLast(new Animal(28, "pirineu", 399.5, 4, 2.91));
		lifoAnimalList.offerLast(new Animal(393, "potablava", 3.55, 2, 1.55));
		lifoAnimalList.offerLast(new Animal(394, "potablava", 3.85, 2, 1.55));
		lifoAnimalList.offerLast(new Animal(398, "potablava", 3.39, 2, 1.55));
		lifoAnimalList.offerLast(new Animal(441, "potablava", 3.45, 2, 1.55));
		lifoAnimalList.offerLast(new Animal(394, "empordanesa", 3.95, 2, 1.17));
		lifoAnimalList.offerLast(new Animal(398, "empordanesa", 3.41, 2, 1.17));
		
		fifoAnimalList.offerFirst(new Animal(32, "frisona", 412.3, 4, 2.71));
		fifoAnimalList.offerFirst(new Animal(22, "frisona", 472.3, 4, 2.71));
		fifoAnimalList.offerFirst(new Animal(82, "pirineu", 422.1, 4, 2.91));
		fifoAnimalList.offerFirst(new Animal(51, "pirineu", 438.1, 4, 2.91));
		fifoAnimalList.offerFirst(new Animal(28, "pirineu", 399.5, 4, 2.91));
		fifoAnimalList.offerFirst(new Animal(393, "potablava", 3.55, 2, 1.55));
		fifoAnimalList.offerFirst(new Animal(394, "potablava", 3.85, 2, 1.55));
		fifoAnimalList.offerFirst(new Animal(398, "potablava", 3.39, 2, 1.55));
		fifoAnimalList.offerFirst(new Animal(441, "potablava", 3.45, 2, 1.55));
		fifoAnimalList.offerFirst(new Animal(394, "empordanesa", 3.95, 2, 1.17));
		fifoAnimalList.offerFirst(new Animal(398, "empordanesa", 3.41, 2, 1.17));

		// Pints the LIFO list
		System.out.println("Cua LIFO");
		while(true) {
			 Animal currentAnimal = lifoAnimalList.pollLast();
			 if(currentAnimal == null) {
				 break;
			 }
			 System.out.println(currentAnimal.getCodi() + " " + currentAnimal.getBreed() + " " + currentAnimal.getPotes() + " " + currentAnimal.valorMercat());
		}

		// Pints the FIFO list
		System.out.println("Cua FIFO");
		while(true) {
			 Animal currentAnimal = fifoAnimalList.pollLast();
			 if(currentAnimal == null) {
				 break;
			 }
			 System.out.println(currentAnimal.getCodi() + " " + currentAnimal.getBreed() + " " + currentAnimal.getPotes() + " " + currentAnimal.valorMercat());
		}
	}
}