import java.util.Scanner;
public class getName {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your name : ");
            String name = sc.nextLine();
            System.err.println("Hello " + name + "! How are you ?");
        }
    }
}
