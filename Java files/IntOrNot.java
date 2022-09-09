import java.util.Scanner;

public class IntOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        boolean b = sc.hasNextInt();
        System.out.println(b);
    }
}
