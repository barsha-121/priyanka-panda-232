import java.util.Scanner;

public class EvenFibonacciSum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        int evenSum = calculateEvenFibonacciSum(N);
        System.out.println("Sum of even Fibonacci numbers up to " + N + " is: " + evenSum);

        scanner.close();
    }
    public static int calculateEvenFibonacciSum(int N) {
        int sum = 0;
        int a = 0;  
        int b = 1;  
        while (b <= N) {
            
            if (b % 2 == 0) {
                sum += b;
            }
            int nextFib = a + b;
            a = b;
            b = nextFib;
        }

        return sum;
    }
}
