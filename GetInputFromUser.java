import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();  

        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " meters.");

        scanner.close();
    }
}
