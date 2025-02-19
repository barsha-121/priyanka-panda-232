import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest (R) in percentage: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the Time period (T) in years: ");
        double time = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year (n): ");
        int n = scanner.nextInt();

        double amount = principal * Math.pow((1 + rate / (100 * n)), n * time);

        double compoundInterest = amount - principal;

        System.out.println("The Compound Interest is: " + compoundInterest);
        System.out.println("The Total Amount (Principal + Interest) is: " + amount);

        scanner.close();
    }
}
