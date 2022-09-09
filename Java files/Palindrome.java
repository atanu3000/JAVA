public class Palindrome {
    static int palindromeOrNot(String str)
    {
        char s[] = new char[str.length()];
        int j = 0;
        for(int i = str.length()-1; i >= 0; i--)
        {   
            s[j++] = str.charAt(i);
            
        }

        // for(int i = 0; i < str.length(); i++){
        //     System.out.println(s[i]);
        // }

        String s2 = String.valueOf(s);
        // System.out.println(s2);
        // System.out.println(str.equals(s2));
        return str.compareTo(s2);
    }
    public static void main(String[] args) {
        String s1 = "wow";
        // boolean key = palindromeOrNot(s1);
        // int key = (palindromeOrNot(s1)) ? 1 : 0;
        if (palindromeOrNot(s1)==0) {
            System.out.println("Yes, " + s1 + " is palindrome");
        } 
        else {
            System.out.println("No, " + s1 + " isn't palindrome");
            
        }


    }
}
