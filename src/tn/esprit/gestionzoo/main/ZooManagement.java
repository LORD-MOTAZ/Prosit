package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Animal chat = new Animal("Félidés", "Chat", 3, true);
        Animal chien = new Animal("Canidés", "Chien", 4, true);

        Zoo zoo1 = new Zoo("Safari Park", "Tunis");
        Zoo zoo2 = new Zoo("tn.esprit.gestionzoo.entities.Zoo Belvédère", "Tunis");
        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        System.out.println("-------- Ajout --------");
        zoo1.addAnimal(chat);
        zoo1.addAnimal(chien);
        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        Dolphin dolphin2 = new Dolphin("Delphinidae", "Flipper", 8, true, "Océan", 25.4f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Pingo", 4, false, "Antarctique", 12.5f);
        Terrestrial lion = new Terrestrial("Félidés", "Lion", 6, true, 4);

        zoo1.displayAnimals();
        System.out.println(dolphin2);
        System.out.println(penguin2);
        System.out.println(lion);

        System.out.println("\nRecherche du lion : index = " + zoo1.searchAnimal(lion));
        Animal lion2 = new Animal("Félidés", "Lion", 7, true);
        System.out.println("Recherche lion2 (même nom) : index = " + zoo1.searchAnimal(lion2));

        System.out.println("\nSuppression du chat : " + zoo1.removeAnimal(chat));
        zoo1.displayAnimals();

        for (int i = 0; i < 30; i++) {
            zoo1.addAnimal(new Animal("Test", "tn.esprit.gestionzoo.entities.Animal" + i, i, true));
        }
        System.out.println("tn.esprit.gestionzoo.entities.Zoo plein ? " + zoo1.isZooFull());

        zoo2.addAnimal(chien);
        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("\ntn.esprit.gestionzoo.entities.Zoo avec le plus d’animaux : " + plusGrand.getName());
        aquatic.swim();
        dolphin2.swim();
    }
}
