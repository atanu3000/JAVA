import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();

        System.out.println("The Reversed String: ");
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(ch[i]);
    
        }
    }
    
}
