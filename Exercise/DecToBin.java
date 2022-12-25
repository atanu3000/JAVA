import java.util.Scanner;
public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        // float dec = sc.nextFloat();
        // float bin = (float) 0.0;
        int dec = sc.nextInt();
        int bin = 0;
        int i = 1;
        while (dec != 0) {
            int rem = ((dec % 2) * i);
            dec /= 2;
            bin += rem;
            i *= 10;
        }
        System.out.println(bin);
        
    }
}
