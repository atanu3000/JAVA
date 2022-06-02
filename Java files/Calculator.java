import java.util;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");
        
        
        System.out.println("Enter two number: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ch;
        do{
            
            System.out.println("\n[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division\n[5] Change your input number\n[6] Exit");
            System.out.print("\t\t Choose your numeric choise: ");
            ch = sc.nextInt();
            
            
            switch(ch) {
                case 1:
                    System.out.println("Ans: " + (a+b));
                    break;
                case 2:
                    System.out.println("Ans: " + (a-b));
                    break;
                case 3:
                    System.out.println("Ans: " + (a*b));
                    break;
                case 4: 
                    System.out.println("Ans: " + (a/b));
                    break;
                case 5:
                    System.out.println("Enter two number: ");
                    a = sc.nextInt();
                    b = sc.nextInt();    
                    break;
                default:
                    System.out.println("Choose correct numeric choise");
                    break;
            }
        }while(ch!=6);
    }
}