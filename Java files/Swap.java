public class Swap {
    public static void main(String[] args) {
        String s1 = "Adrija";
        String s2 = "Roy";

        System.out.println("Before swapping: " + s1 + " " + s2);
        s1 = s1 + s2;
        s2 = s1.substring(0, (s1.length() - s2.length()));
        s1 = s1.substring(s2.length());
        System.out.println("After swapping: " + s1 + " " + s2);
    }
}
