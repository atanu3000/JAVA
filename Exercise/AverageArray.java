import java.util.Scanner;
public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        float avg = (float) 0.0;
        for (int i = 0; i < a.length; i++) {
            avg += a[i];
        }
        avg /= size;
        System.out.println("Average of each elements: " + avg);
    }
    
}
