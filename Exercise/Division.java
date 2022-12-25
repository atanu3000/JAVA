import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        float ans =(float) a / b;
        int rem = a % b;

        System.out.println("Division = " + ans);
        System.out.println("Remainder = " + rem);
    }
}