import java.util.*;

public class solutions {
    //func for average
    /*public static int avr(int n1, int n2, int n3){
        int sum = n1+n2+n3;
        return sum/3;
    }*/

    //func for sum of odd nums from 1 to n
    /*public static int oddSum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }*/
    /*public static int oddSum(int n){    //using recurtion
        if(n==0 || n==1){
            return n;
        } 
        else if(n%2!=0){
            return n + oddSum(n-1);
        }
        else{
        	return oddSum(n-1);
		}
    }*/

    //func for greater between two nums
    /*public static void greatNum(int n1, int n2){
        if(n1>n2){
            System.out.println("greater num = "+n1);
        }
        else{
            System.out.println("greater num = "+n2);
        }
    }*/

    /*public static double circumferernce(int radius){
        return 2*3.14*radius;
    }*/

    //Eligible for vote or not
    /*public static void elgForVote(int age) {
        if(age>=18 && age<100){
            System.out.println("Eligible for Vote");
        } else if (age>=100){
            System.out.println("He/she is no more");
        } else {
            System.out.println("Not eligible for Vote");
        }
    }*/

    //power of number
    /*public static void powNum(int n1, int n2) {
        int ans=1;
        while((n2--)!=0){
            ans *= n1;
        }
        System.out.println("ans : "+ans);
    }*/

    //Greatest Common Divisor 
    /*public static int gcdNum(int x, int y) {
        int min, gcd = 0;
        if(x<y){
            min = x;
        } else{
            min = y;
        }

        for(int i=2; i<=min; i++){
            if(x%i==0 && y%i==0){
                gcd = i;
            }
        }
        return gcd;
    }*/

    //Fibonacci Series
    /*public static void fibc(int n) {
        int a=0, b=1, c;
        System.out.print("0 1 ");
        for(int i=1; i<=n-2; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
        
    }*/


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter a number: ");
        int n = sc.nextInt(), flag=0;
        for(int i=2; i<n/2; i++){
            if(n%i==0){
                flag = 1;
            }                
        }
        if(flag==1)
            System.out.println("NOt Prime");
        else  
            System.out.println("Prime");*/

        /*System.out.println("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average: "+avr(a,b,c)); */

        /*System.out.println("Enter the n-th term: ");
        int n = sc.nextInt();
        System.out.println("sum = "+oddSum(n)); */

        /*System.out.print("enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        greatNum(a,b);*/

       /* System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        System.out.println("circumferernce: "+circumferernce(r)); */

        /*System.out.print("Enter your age: ");
        int age = sc.nextInt();
        elgForVote(age);*/

        //Infinite loop
        /*int i = 1;
        do{
            System.out.println("hello");
            i--;
        } while(i<10); */

        /*System.out.print("Enter any number: ");
        int x = sc.nextInt();
        System.out.print("Enter the power: ");
        int n = sc.nextInt();
        powNum(x,n); */       

        //greatest common divisor
        /*System.out.print("Enter two number: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("GCD: "+gcdNum(n, m));*/

        //Fibonacci series
        /*System.out.print("Enter no. of terms: ");
        int n = sc.nextInt();
        fibc(n);*/

        //Fibonacci pattern
        System.out.print("Enter the row number: ");
        int r = sc.nextInt();
        
        for(int i=0; i<r; i++){
            
            
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            } for(int j=0; j<i; j++){
                
            
            }
            System.out.println();
        }
        
    }
}