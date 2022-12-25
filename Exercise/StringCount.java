import java.util.Scanner;
public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        // System.out.println("String length: " + s.length());
        count(s);
    }
    public static void count(String x) {
        char[] ch = x.toCharArray();
        int letter = 0, space = 0, num = 0, others = 0;
        for(int i = 0;  i < x.length();  i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if(Character.isDigit(ch[i])) {
                num++;
            }else if(Character.isSpaceChar(ch[i])){
                space++;
            }else {
                others++;
            }
        }
        System.out.println("Letters: " + letter);
        System.out.println("Spaces: " + space);
        System.out.println("Number: " + num);
        System.out.println("Others: " + others);

    }
}
