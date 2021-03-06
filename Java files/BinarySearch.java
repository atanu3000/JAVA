
import java.io.*;
import java.util.*;

  public class BinarySearch {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("test cases: ");
        int T = sc.nextInt();
        while (T > 0) {
            System.out.print("Size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Elements of array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Search here: ");
            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println("possition: " + g.binarysearch(arr, n, key));
            T--;
        }
    }
}


class Solution {
    int binarysearch(int arr[], int r, int x) {
        // code here
        int l = 0;
        r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;
        
    }
}