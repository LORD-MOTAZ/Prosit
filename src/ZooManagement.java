import java.util.Scanner;

/* public class ZooManagement {
    static int nbrCages = 20;
    static String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        System.out.println( zooName + " comporte " + nbrCages + " cages");
    }
} */

public class ZooManagement {
    static int nbrCages ;
    static String zooName ;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();

        do {
            System.out.println("Saisir le nombre de cages : ");

            while (!sc.hasNextInt()) {
                System.out.println("Resaisir le nombre de cages : ");
                sc.nextLine();
            } nbrCages = sc.nextInt();
        }while (nbrCages <= 0);

        do {
            System.out.println("Saisir le nom du zoo : ");
            zooName = sc.nextLine().trim();

            if (zooName.isEmpty()) {
                System.out.println("Le nom du zoo ne peut pas être vide. Veuillez réessayer.");
            }

        } while (zooName.isEmpty());


        sc.close();
        System.out.println( zooName + " comporte " + nbrCages + " cages");
    }
}