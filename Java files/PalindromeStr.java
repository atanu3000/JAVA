public class PalindromeStr {
    public static void main(String[] args) {
        String str = "madam";
        int key = 0, len = str.length();
        
        for(int i = 0; i <= len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                key = 1;
                break;
            }
        }
        if(key==1){
            System.out.println(str + " isn't palindrome");
        }
        else{
            System.out.println(str + " is palindrome");
        }
    }
}
