package String;

public class CheckPalindrome {
    static void main() {
        String string = "Madam";
        String str = string.toLowerCase();
        String reversed = "";
        for(int i= str.length()-1; i>=0; i--){
            reversed = reversed + str.charAt(i);
        }
        if(str.equals(reversed)){
            System.out.println("The given String is palindrome");
        }else{
            System.out.println("The given String not Palindrome");
        }
    }
}
