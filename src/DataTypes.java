import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        int cats = 5;
        int catsEntered;

        int barrel;

        System.out.println("Number of cats = " + cats);

        barrel = cats;

        System.out.println("Number of cats in the barrel = " + barrel);
        System.out.println("How many cats do you want to add into the barrel?");
        Scanner inputDevice = new Scanner(System.in);
        catsEntered = inputDevice.nextInt();

        barrel = cats + catsEntered;

        System.out.println("There are now " + barrel + " cats in the barrel");
        barrel = barrel/(1 +(int)(Math.random()*10));
        System.out.println("Due to overpopulation and diseases, you killed some of the cats\n" + "There are now only " + barrel + " cats left in the barrel. SAD!");

    }
}
