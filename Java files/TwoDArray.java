import java.util.*;

public class TwoDArray{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Matrix
        System.out.print("Enter the row and col: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][]= new int[row][col];

        System.out.println("Enter the elements bellow: ");
        //input
        //rows
        for(int i=0; i<row; i++){
            //columns
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        /*System.out.println();
        //output
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } */

        //Search an element in matrix
        /*System.out.print("Enter any element: ");
        int elm = sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]==elm){
                    System.out.println("Search result: (" + (i+1) + "," + (j+1) + ")");
                    break;
                }
            }
        }*/

        //Transpose Matrix
        System.out.println("Transpose of the matrix: ");
        for(int j=0; j<col; j++){
            for(int i=0; i<row; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

