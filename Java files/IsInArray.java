import java.util.*;
public class IsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] a = {1, 2, 3, 4, 5};
        System.out.println("Enter the element");
        int elm = sc.nextInt();
        boolean b = Arrays.asList(a).contains(elm);
        System.out.println(b);
        if(b){
            System.out.println(elm + " is present");
        }
        else{
            System.out.println(elm + " is not present");
        }
    }
}
