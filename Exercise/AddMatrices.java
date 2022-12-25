import java.util.Scanner;
public class AddMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrices(n*n): ");
        int size = sc.nextInt();
        int[][] m1 = new int[size][size];
        System.out.println("Enter the elements of 1st matrix");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        
        int[][] m2 = new int[size][size];
        System.out.println("Enter the elements of 2nd matrix");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition of the two matrices: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(m1[i][j] + m2[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
