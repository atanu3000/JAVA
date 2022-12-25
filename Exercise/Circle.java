import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float r = sc.nextFloat();
        float  PI = (float) 3.14159;
        float per = (float) 2 * PI * r;
        float area = (float) PI * r * r;

        System.out.println("Perimeter : " + per);
        System.out.println("Area : " + area);
    }
}
