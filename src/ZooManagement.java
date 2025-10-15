public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Félidés", "Lion", 5, true);
        Animal chat = new Animal("Félidés", "Chat", 3, true);
        Animal chien = new Animal("Canidés", "Chien", 4, true);
        Zoo myZoo = new Zoo("Safari Park", "Tunis", 25);

        Zoo zoo1 = new Zoo("Safari Park", "Tunis");
        Zoo zoo2 = new Zoo("Zoo Belvédère", "Tunis");

        System.out.println("-------- Ajout --------");
        zoo1.addAnimal(chat);
        zoo1.addAnimal(chien);
        zoo1.addAnimal(lion);

        zoo1.addAnimal(lion);
        System.out.println("-------- Résultats --------");
        zoo1.displayAnimals();

        System.out.println("Animal -> Nom: " + lion.getName() +
                ", Famille: " + lion.getFamily() +
                ", Âge: " + lion.getAge() +
                ", Mammifère: " + lion.isMammal());
        System.out.println("\nRecherche du lion : index = " + zoo1.searchAnimal(lion));
        Animal lion2 = new Animal("Félidés", "Lion", 7, true);
        System.out.println("Recherche lion2 (même nom) : index = " + zoo1.searchAnimal(lion2));

        System.out.println("Zoo -> Nom: " + myZoo.getName() +
                ", Ville: " + myZoo.getCity() +
                ", Nombre de cages: " + myZoo.getNbrCages());
        System.out.println("\nSuppression du chat : " + zoo1.removeAnimal(chat));
        zoo1.displayAnimals();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        for (int i = 0; i < 30; i++) {
            zoo1.addAnimal(new Animal("Test", "Animal" + i, i, true));
        }
        System.out.println("Zoo plein ? " + zoo1.isZooFull());

        System.out.println(chat);
        System.out.println(chien.toString());
        zoo2.addAnimal(chien);
        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("\nZoo avec le plus d’animaux : " + plusGrand.getName());
    }
}