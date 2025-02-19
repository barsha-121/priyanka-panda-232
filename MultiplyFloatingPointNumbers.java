import java.util.Scanner;

public class MultiplyFloatingPointNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();  

        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();  
        double result = num1 * num2;

        System.out.println("The result of multiplication is: " + result);

        scanner.close();
    }
}