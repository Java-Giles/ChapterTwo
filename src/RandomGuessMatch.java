import java.util.Scanner;

public class RandomGuessMatch {
    public static void main(String[] args) {

        int guess;
        final int random = 1 +(int)(Math.random() * 5);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 5>>>> ");
        guess = input.nextInt();
        boolean isEqual = random == guess;

        System.out.print("Your guess of " + guess + " was " + isEqual);
    }
}
