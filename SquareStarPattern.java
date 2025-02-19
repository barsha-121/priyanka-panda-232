import java.util.Scanner;

public class SquareStarPattern {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square (number of rows and columns): ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
        
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
