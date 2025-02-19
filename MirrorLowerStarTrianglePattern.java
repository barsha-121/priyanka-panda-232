import java.util.Scanner;

public class MirrorLowerStarTrianglePattern {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the mirror lower star triangle: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        scanner.close();
    }
}
