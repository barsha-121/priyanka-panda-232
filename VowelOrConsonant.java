import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        if (isVowel(character)) {
            System.out.println(character + " is a vowel.");
        } else if (Character.isLetter(character)) {
            System.out.println(character + " is a consonant.");
        } else {
            System.out.println(character + " is not a valid alphabetic character.");
        }

        scanner.close();
    }

    public static boolean isVowel(char character) {
        
        character = Character.toLowerCase(character);

        return (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u');
    }
}
