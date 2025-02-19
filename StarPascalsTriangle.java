import java.util.Scanner;

public class StarPascalsTriangle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            
            for (int j = 1; j < rows - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
            
                if (j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
