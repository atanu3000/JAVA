import java.util.*;

public class Patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // SOLID RECTANGLE
        /*System.out.println("Enter the row and col : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("* ");
            }
            System.out.println();
        } */
// flip half Pyramid
        /*System.out.println("Enter the row: ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=r; j>=i; j--) {
                System.out.print("  ");
            } for(int j=1; j<=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        } */

        // HOLLOW RECTANGLE

       /* System.out.println("Enter the row and col");
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || j==1 || i==row || j==col)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        } */

        //Invarted Half Pyramid

       /*System.out.println("Enter the row: ");
        int r = sc.nextInt();
        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        } */

        // half pyramid with number
       /* System.out.println("Enter the row: ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/ 

        //Invarted Half Pyramid with Number
       /* System.out.println("Enter the row: ");
        int r = sc.nextInt();
        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
         
        //Floyd's Triangle
        /*System.out.println("Enter the row: ");
        int r = sc.nextInt();
        int n = 1;
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        } */

        // solid Rhombus.
       /* System.out.println("Enter row: ");
        int r = sc.nextInt();
        for(int i=0; i<r; i++){
            for(int j=0; j<r-i; j++) {
                System.out.print("  ");
            } for(int j=0; j<r; j++){
                System.out.print("* ");
            }
            System.err.println();
        } */

        //binary half pyramid
        /*System.out.println("Enter the row : ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
               if((i+j)%2==0)                    //if(i%2==0 && j%2==0)
                    System.out.print("1 ");         // System.out.print("1 ");
                else                             //else if(i%2!=0 && j%2!=0)
                    System.out.print("0 ");         // System.out.print("1 ");    
            }
            System.out.println();
        } */

       /* System.out.println("Enter the row: ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/

        // Palindrome number pyramid
       /* System.out.println("Enter the row: ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){    //first part
                System.out.print(j+" ");
            } for(int j=2;j<=i; j++){   //second part
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        //Star Kite pattern
        /*System.out.println("Enter the row: ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){    //first part
                System.out.print("* ");
            } 
            System.out.println();
        }
        for(int i=r; i>=1; i--){
            for(int j=1; j<=r-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){    //first part
                System.out.print("* ");
            } 
            System.out.println();
        }*/

        //Butterfly Pattern
        /*System.out.println("Enter row : ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            } for(int j=1; j<=2*(r-i); j++) {
                System.out.print("  ");
            } for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            } for(int j=1; j<=2*(r-i); j++) {
                System.out.print("  ");
            } for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //Hollow Butterfly Pattern
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                if( j==1 || j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            } for(int j=1; j<=2*(r-i); j++){
                System.out.print("  ");
            }for(int j=1; j<=i; j++){
                if(j==1 || j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            } 
            System.out.println();
        }
        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                if( j==1 || j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            } for(int j=1; j<=2*(r-i); j++){
                System.out.print("  ");
            }for(int j=1; j<=i; j++){
                if(j==1 || j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            } 
            System.out.println();
        }

        // Hollow Rhombus
        /*System.out.println("Enter row: ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            } for(int j=1; j<=r; j++){
                if(i==1 || j==1 || i==r || j==r)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }*/


    }
}