import java.util.Scanner;
public class ArrayMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[5];
        System.out.println("Enter the Elements of the 1st array: ");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        
        int[] a2 = new int[5];
        System.out.println("Enter the elements of the 2nd array: ");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
         
        System.out.println("After multiplication of corresponding elements: ");
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a1[i]*a2[i] + " ");
        }
    }
    
}
