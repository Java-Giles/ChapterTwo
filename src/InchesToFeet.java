import java.util.Scanner;

public class InchesToFeet {

    public static void main(String[] args) {

        int inchesEntered;
        int numFeet;
        int inchesLeft;
        final int INCHES_IN_FOOT = 12;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number of inches to convert>>>> ");
        inchesEntered = keyboard.nextInt();

        numFeet = inchesEntered/INCHES_IN_FOOT;
        inchesLeft = inchesEntered%INCHES_IN_FOOT;

        System.out.print("In " + inchesEntered + " inches, there are " + numFeet + " feet and " + inchesLeft + " inches.");
    }
}