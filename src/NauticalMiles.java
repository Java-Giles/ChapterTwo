import java.util.Scanner;

public class NauticalMiles {

    public static void main(String[] args) {

        double nauticalMiles;
        double nmilesInMile;
        double nmilesInKilo;
        final double NMILES_TO_MILE = 1.150779;
        final double NMILES_TO_KILO = 1.852;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of Nautical Miles>>>>");
        nauticalMiles = keyboard.nextDouble();

        nmilesInMile = nauticalMiles*NMILES_TO_MILE;

        nmilesInKilo = nauticalMiles*NMILES_TO_KILO;

        System.out.println("In " + nauticalMiles + " nautical miles, there are " + nmilesInMile + " miles, and " + nmilesInKilo + " kilometers.");


    }
}
