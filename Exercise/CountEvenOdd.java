import java.util.Scanner;
public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int even = 0, odd = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 ==0 ){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
    }
}
