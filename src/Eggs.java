import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {

        int eggsEntered;
        int eggDozens;
        int eggsLeft;
        double looseCost;
        double dozenCost;
        double totalCost;
        final double DOZEN_EGG_COST = 3.25;
        final double LOOSE_EGG_COST = 0.45;
        final int EGGS_IN_DOZENS = 12;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many eggs are you buying?");
        eggsEntered = keyboard.nextInt();

        eggDozens = eggsEntered / EGGS_IN_DOZENS;
        eggsLeft = eggsEntered % EGGS_IN_DOZENS;

        dozenCost = eggDozens * DOZEN_EGG_COST;
        looseCost = eggsLeft * LOOSE_EGG_COST;
        totalCost = looseCost + dozenCost;

        System.out.print("You bought " + eggsEntered + " eggs. That's " + eggDozens + " dozens at $3.25 per dozen and " + eggsLeft + " loose eggs at 45 cents each, for a total of $" + totalCost);


    }
}
