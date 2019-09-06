import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        String color;
        String estWord;
        String bodyPart;
        String animal;
        String noun;
        String nounPlur;

        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a color>>>> ");
        color = input.nextLine();
        System.out.print("Enter a word that ends with -est>>>> ");
        estWord = input.nextLine();
        System.out.print("Enter a plural body part>>>> ");
        bodyPart = input.nextLine();
        System.out.print("Enter an animal>>>> ");
        animal = input.nextLine();
        System.out.print("Enter a noun>>>> ");
        noun = input.nextLine();
        System.out.print("Enter a plural noun>>>> ");
        nounPlur = input.nextLine();
        System.out.print("Enter a number>>>> ");
        a = input.nextInt();
        System.out.print("Enter another number>>>> ");
        b = input.nextInt();

        c =  a % b;

        System.out.print("The " + color + "  dragon is the " + estWord + " dragon of all. It has " + c +" " + bodyPart + ", and a \n" + animal + " shaped like a " + noun + ". It loves to eat " + nounPlur + ", although it will feast on nearly anything.");
    }
}
