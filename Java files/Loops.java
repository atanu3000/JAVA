import java.util.*;

public class Loops {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
        /*for(int i = 0; i<10; i++) {
            System.out.println(i);
        } */
        
        // HOMEWORK PROBLEMS...

        /* System.out.println("Enter n-th term: ");
        int n = sc.nextInt(), sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
               sum+=i;
            }
        }
        System.out.println("sum = " + sum); */

       /* System.out.println("1 for continue \n0 for stop");
        int ch;
        do {
            System.out.println("choose any one: ");
            ch = sc.nextInt();
            System.out.println("Enter your marks: ");
            int marks = sc.nextInt();
            if(marks>=90){
                System.out.println("This is good");
            } else if(marks>=60){
                System.out.println("This is also good");
            } else {
                System.out.println("This is good as well");
            }
        } while(ch==1); */

        // Difference between while or do-while loop...

        /*int i = 12;
        while(i<11) {
            System.out.println("Hello");
        }

        do {
            System.out.println("Hello");
        } while(i<11); */

        System.out.println("Enter a number for table: ");
        int n = sc.nextInt();

        for(int  i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " +  n*i );
        } 
    }
}
