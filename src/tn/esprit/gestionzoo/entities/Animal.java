package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayAnimal() {
        System.out.println("Animal: " + name +
                " | Famille: " + family +
                " | Âge: " + age +
                " | Mammifère: " + isMammal);
        if (age < 0) {
            System.out.println("⚠️ Âge invalide, mis à 0 par défaut !");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Animal{name='" + name +
                "', family='" + family +
                "', age=" + age +
                ", isMammal=" + isMammal + "}";
    }
}