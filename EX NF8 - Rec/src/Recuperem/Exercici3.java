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
import java.util.HashMap;
import java.util.TreeSet;

// Has de crear una estructura d'animals que ordeni primer per raça 
// i després pel seu preu de venda
// 
// OPCIÓ 1: Fins a 5,5 punts
// Estructura bidimensional, sent la primera "dimensió" les races ordenades alfabèticament
//     i la segona "dimensió" els animals de cada raça ordenats per valor sense canviar allò fet 
//     a l'exercici 2
// Cal extreure totes les races (només un cop)
// Per cada raça, crear un element de "segona dimensió" i omplir-lo amb cada animal si coincideix la raça
// Mostrar els animals agrupats per races, i després per valor
// - Extreure races i mostrar-les: 0,5
// - Definir l'estructura bidimensional: 1,5 punts
// - Omplir l'estructura bidimensional: 2 punts
// - Mostrar l'estructura correctament: 1,5 punts


public class Exercici3 {
	public static void main(String[] args) {

		ArrayList<Animal> LlistaInicial = new ArrayList<Animal>();

		LlistaInicial.add(new Animal(32, "frisona", 412.3, 4, 2.71));
		LlistaInicial.add(new Animal(22, "frisona", 472.3, 4, 2.71));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(82, "pirineu", 422.1, 4, 2.91));
		LlistaInicial.add(new Animal(51, "pirineu", 438.1, 4, 2.91));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(393, "potablava", 3.55, 2, 1.55));
		LlistaInicial.add(new Animal(394, "potablava", 3.85, 2, 1.55));
		LlistaInicial.add(new Animal(398, "potablava", 3.39, 2, 1.55));
		LlistaInicial.add(new Animal(441, "potablava", 3.45, 2, 1.55));
		LlistaInicial.add(new Animal(394, "empordanesa", 3.95, 2, 1.17));
		LlistaInicial.add(new Animal(398, "empordanesa", 3.41, 2, 1.17));
		LlistaInicial.add(new Animal(331, "campiona", 3.41, 2, 871.71));
		
		// Creates a HashMap for animals
		HashMap<Integer, Animal> animalMap = new HashMap<Integer, Animal>();
		
		// Adds each element of the animal list to the animal map
		for (int i = 0; i < LlistaInicial.size(); i++) {
			animalMap.put(LlistaInicial.get(i).getCodi(), LlistaInicial.get(i));
		}

		// Creates a HashMap of animal sets
		HashMap<String, TreeSet<Animal>> animalTreeSetMap = orderingMethod(animalMap);

		// Goes through the animal tree set map
		for (String race : animalTreeSetMap.keySet()) {
			// Gets each animal set per individual race
			TreeSet<Animal> currentAnimalSet = animalTreeSetMap.get(race);
			// While there are elements inside the current animal set
			while (!currentAnimalSet.isEmpty()) {
				// Save that animal
				Animal currentAnimal = currentAnimalSet.pollFirst();
				// And print it's information
				System.out.println(currentAnimal.getCodi() + " " + currentAnimal.getBreed() + " " + currentAnimal.getPotes() + " " + currentAnimal.valorMercat());
			}
		}
	}
	
	public static HashMap<String, TreeSet<Animal>> orderingMethod(HashMap<Integer, Animal> mapToBeOrdered) {
		
		// Creates an ordered map that will be returned at the end of the method
		HashMap<String, TreeSet<Animal>> finalOrdering = new HashMap<String, TreeSet<Animal>>();
		
		// Creates a comparator to compare two animals alphabetically
		Comparator<String> alphabeticalOrdenation = new Comparator<String>() {
			@Override
			public int compare(String string1, String string2) {
				return string1.compareTo(string2);
			}
		};
		
		// Creates a comparator to compare two animals by their market value
		Comparator<Animal> valueOrdenation = new Comparator<Animal>() {
			@Override
			public int compare(Animal animal1, Animal animal2) {
				if (animal1.valorMercat() > animal2.valorMercat()) {
					return -1;
				} else if (animal1.valorMercat() < animal2.valorMercat()) {
					return 1;
				} else {
					return 0;
				}
			}
		};
		
		// Creates a set which will be ordered alphabetically
		TreeSet<String> races = new TreeSet<String>(alphabeticalOrdenation);
		
		// For each individual race, adds that race to the set
		for (Integer key : mapToBeOrdered.keySet()) {
			races.add(mapToBeOrdered.get(key).getBreed());
		}
		
		// Prints all races
		System.out.println("Llista de races " + races);

		// For each race in the races set
		for (String race : races) {
			// Reset an animal set each time
			TreeSet<Animal> currentAnimalSet = new TreeSet<Animal>(valueOrdenation);
			// For each different animal in a map
			for (Integer key : mapToBeOrdered.keySet()) {
				// Compares that animal with the current set's race
				if (mapToBeOrdered.get(key).getBreed() == race) {
					// If true, adds that animal to the current set
					currentAnimalSet.add(mapToBeOrdered.get(key));
				}
				// Stores that animal in a final ordering 
				finalOrdering.put(race, currentAnimalSet);
			}
		}
		// Returns the final ordering of each map
		return finalOrdering;
	}
}