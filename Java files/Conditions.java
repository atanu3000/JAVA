import java.util.*;



public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
           /* int age = sc.nextInt();
            if(age > 18 || age == 18){
                System.out.println("Adult");
            } else{
                System.out.println("Not Adult");
            }*/

            /*int n = sc.nextInt();

            if(n%2==0){
                System.out.println("even");
            } else{
                System.out.println("odd");
            }*/

           /* int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a==b){
                System.out.println("equal");
            } else if(a>b){
                System.out.println(a + " is greater then " + b);
            } else{
                System.out.println(b + " is greater than " + a);
            } */
            
           /* int button;
            do {
                System.out.println("enter a button(1/2/3): ");
                button = sc.nextInt();
                switch(button) {
                    case 1: System.out.println("bonjour");
                    break;
                    case 2: System.out.println("Namaste");
                    break;
                    case 3: System.out.println("Hello");
                    break;
                    default: System.out.println("invalid button");
                }
            } while(button<=3); */
            System.out.println("1.  sum");
            System.out.println("2.  sub");
            System.out.println("3.  mul");
            System.out.println("4.  div");
        
            int a, b,op;
            float ans;

            do {
                System.out.println("enter two num: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("choose any operation(1/2/3/4): ");
                op = sc.nextInt();
                switch(op) {
                    case 1: ans = a + b;
                    System.out.println("sum = " + ans);
                    break;

                    case 2: ans = a - b;
                    System.out.println("sub = " + ans);
                    break;

                    case 3: ans = a * b;
                    System.out.println("product = " + ans);
                    break;

                    case 4: ans = a / b;
                    System.out.println("quotient = " + ans);
                    break;

                    default: System.out.println("choose valid operation");
                }
            } while(op<=4);

            

        
    }
}