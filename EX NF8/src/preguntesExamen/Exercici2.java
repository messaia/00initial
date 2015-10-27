/* 
 * Examen pràctic M02 UF 8
 * 
 * Alumne: Miquel Luque Rodriguez
 * DNI: 47893936R
 * 
 */

package preguntesExamen;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

// Exercici 2: (2,5 punts)
// Mostra de forma ordenada segons el valor de venda del mercat de l'animal
// de més a menys valuós
// Definició de la bona estructura que no admeti duplicats: 0,75 punt
// controlar un duplicat: 0,25 punt
// Sistema per endreçar els animals segons el preu de venda (de més a menys) 1 punt
//    aquest criteri serà reutilitzat a l'exercici 3
// Mostrar bé els animals: 0,5 punts


public class Exercici2 {

	public static void main(String[] args) {
		
		// Declares an animal set
		
		TreeSet<Animal> animalSet = new TreeSet<Animal>(
				new Comparator<Animal>() {
					@Override
					// Compares the market value of both animals
					public int compare(Animal animal1, Animal animal2) {
						if (animal1.valorMercat() > animal2.valorMercat()) {
							return -1;
						} else if (animal1.valorMercat() < animal2.valorMercat()) {
							return 1;
						} else {
							return 0;
						}
					}
				});
		
		// Adds the elements to the set
		
		animalSet.add(new Animal(32, "frisona", 412.3, 4, 2.71));
		animalSet.add(new Animal(22, "frisona", 472.3, 4, 2.71));
		animalSet.add(new Animal(82, "pirineu", 422.1, 4, 2.91));
		animalSet.add(new Animal(51, "pirineu", 438.1, 4, 2.91));
		animalSet.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		animalSet.add(new Animal(393, "potablava", 3.55, 2, 1.55));
		animalSet.add(new Animal(394, "potablava", 3.85, 2, 1.55));
		animalSet.add(new Animal(398, "potablava", 3.39, 2, 1.55));
		animalSet.add(new Animal(441, "potablava", 3.45, 2, 1.55));
		animalSet.add(new Animal(394, "empordanesa", 3.95, 2, 1.17));
		animalSet.add(new Animal(398, "campiona", 3.41, 2, 871.71));
		
		/*
		 * Com la defineixes ordenada?
		 * Amb un Comparator que, al crear el set, afegirà els elements utilitzant aquesta comparació.
		 */
	
		// Tries to add a duplicate animal. If successful, prints that animal before the list 
		
		Animal afegeix = new Animal(394, "empordanesa", 3.95, 2, 1.17);
		if ( animalSet.add(afegeix)) {
			System.out.println(afegeix.getCodi() + " " + afegeix.getBreed() + " " + afegeix.getPotes() + " " + afegeix.valorMercat());
		}
		
		System.out.println("Afegim");
		
		// Prints the set using an iterator
		
		Iterator<Animal> iterator = animalSet.iterator();
		while(iterator.hasNext())  {
			Animal currentAnimal = iterator.next();
			System.out.println(currentAnimal.getCodi() + " " + currentAnimal.getBreed() + " " + currentAnimal.getPotes() + " " + currentAnimal.valorMercat());
		}
	}
}
