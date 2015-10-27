package Recuperem;

/* 
 * Examen pràctic M02 UF 8 - Recuperació
 * 
 * Alumne: Miquel Luque Rodriguez
 * DNI: 47893936R
 * 
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

// Exercici 2 (2,5 punts)
// Crea una estructura dinàmica de dades que emmagatzemi 
// de forma que els animals es mostrin segons la següent fórmula
// - Els animals de dues potes sempre valen menys que els animals de quatre potes
// - Si tenen el mateix nombre de potes, aleshores es comparen pel preu de venda
// 
// Intenta afegir els animals af1 i af2 tot mostrant el resultat
//
//
// Criteri
// Bona estructura: 0,5
// Criteri d'ordenació: 1
// S'intenta afegir bé els dos animals: 0,5
// Es mostra bé com ha quedat: 0,5
//-0,5 si hi ha mètodes dels quals no en verifiques el retorn (excepte els proporcionats pel professor)



public class Exercici2 {

	public static void main(String[] args) {
		ArrayList<Animal> LlistaInicial = new ArrayList<Animal>(11);
		LlistaInicial.add(new Animal(32, "frisona", 412.3, 4, 2.71));
		LlistaInicial.add(new Animal(22, "frisona", 472.3, 4, 2.71));
		LlistaInicial.add(new Animal(82, "pirineu", 422.1, 4, 2.91));
		LlistaInicial.add(new Animal(51, "pirineu", 438.1, 4, 2.91));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(393, "potablava", 3.55, 2, 1.55));
		LlistaInicial.add(new Animal(394, "potablava", 3.85, 2, 1.55));
		LlistaInicial.add(new Animal(398, "potablava", 3.39, 2, 1.55));
		LlistaInicial.add(new Animal(441, "potablava", 3.45, 2, 1.55));
		LlistaInicial.add(new Animal(394, "empordanesa", 3.95, 2, 1.17));
		LlistaInicial.add(new Animal(398, "campiona", 3.41, 2, 871.71));
		Animal af1 = new Animal(394, "empordanesa", 3.95, 2, 1.17);
		Animal af2 = new Animal(394, "empordanesa", 3.99, 2, 1.17);
		

		// Declares an animal set with required ordenation criteria
		
		TreeSet<Animal> animalSet = new TreeSet<Animal>(
				new Comparator<Animal>() {
					@Override
					// Compares the number of legs the animal has
					public int compare(Animal animal1, Animal animal2) {
						if (animal1.getPotes() > animal2.getPotes()) {
							return -1;
						} else if (animal1.getPotes() < animal2.getPotes()) {
							return 1;
						} else {
							// Compares the market value of both animals
							if (animal1.valorMercat() > animal2.valorMercat()) {
								return -1;
							} else if (animal1.valorMercat() < animal2.valorMercat()) {
								return 1;
							} else {
								return 0;
							}
						}
					}
				});
		
		// Adds the elements to the set
		animalSet.addAll(LlistaInicial);
		
		// Attempts to add two more animals, one duplicate and one new. If successful, prints a line and that animal
		System.out.println("Afegim f1?");
		if ( animalSet.add(af1)) {
			System.out.println("He pogut afegir: " + af1.getCodi() + " " + af1.getBreed() + " " + af1.getPotes() + " " + af1.valorMercat());
		}
		System.out.println("Afegim f2?");
		if ( animalSet.add(af2)) {
			System.out.println("He pogut afegir: " + af2.getCodi() + " " + af2.getBreed() + " " + af2.getPotes() + " " + af2.valorMercat());
		}
		
		// Prints the set using an iterator
		Iterator<Animal> iterator = animalSet.iterator();
		while(iterator.hasNext())  {
			Animal currentAnimal = iterator.next();
			System.out.println(currentAnimal.getCodi() + " " + currentAnimal.getBreed() + " " + currentAnimal.getPotes() + " " + currentAnimal.valorMercat());
		}
	}
}