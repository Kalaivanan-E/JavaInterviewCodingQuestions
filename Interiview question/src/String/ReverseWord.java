package String;

public class ReverseWord {
    public static void main(String[] args) {
        String string = " The Sky is Blue";
        String[] words = string.split(" +");
        String reverse = "";
        for(int i = words.length-1; i>=0; i--){
            reverse = reverse + words[i];
            reverse = reverse + " ";
        }
        System.out.println(reverse);

    }
    
}
