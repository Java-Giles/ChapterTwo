import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        char firstInitial;
        char middleInitial;
        char lastInitial;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your first initial>>>> ");
        firstInitial = keyboard.next().charAt(0);

        System.out.print("Enter your middle initial>>>> ");
        middleInitial = keyboard.next().charAt(0);

        System.out.print("Enter your last initial>>>> ");
        lastInitial = keyboard.next().charAt(0);

        System.out.print("Your three initials are " + firstInitial + "." + middleInitial + "." + lastInitial + ".");
    }
}
