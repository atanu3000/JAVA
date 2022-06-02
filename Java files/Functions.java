import java.util.*;

public class Functions {
   /* public static void printName(String name) {
        System.out.println(name);
        return;*/

   /* public static int sum(int a, int b) {
        int add = a + b;
        return add;
    }

    public static int mul(int a, int b){
        return a * b;
    }*/

    //Function for factorial
    public static int fact(int n) {
        if(n<0){
            System.out.println("Invalid");
            return 0;
        }            
        int f = 1;
        /*for(int i=1; i<=n; i++){
            f *= i;
        }*/
        for(int i=n; i>=1; i--){
            f *= i;
        }
        return f;
    }
    //using Recursive function
    /*public static int fact(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n * fact(n-1);
    }*/
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        /* String name = sc.next();
        printName(name); */  //function calling

       /* System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = sum(a, b);

        System.out.println("sum of 2 number: "+ans);
        System.out.println("Product is: "+mul(a,b));*/

        //calculate factorial number.
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial : "+fact(n));
        
    }
}