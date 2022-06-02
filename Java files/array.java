import java.util.*;

public class array{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //  int[] marks = new int[3];
        /*  int marks[] = new int[3];
        marks[0] = 97; //phy
        marks[1] = 95; //chem
        marks[2] = 99; //math

        //  int marks[] = {97, 95, 99};
        //  System.out.println(marks[0]);
        //  System.out.println(marks[1]);
        //  System.out.println(marks[2]);

        for (int i=0; i<3; i++){
            System.out.println(marks[i]);
        }   */
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        //input
       /* for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Elements of the array: ");
        //output
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
            sum +=arr[i];
        }
        System.out.println();
        System.out.println("sum of the elements: "+sum); */
        
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a element for search: ");
        int elm = sc.nextInt();
        
        for(int i=0; i<n; i++){
            if(elm==arr[i]){
                System.out.println("index: "+i);
                break;
            }
            
        }
        
        
    }
}