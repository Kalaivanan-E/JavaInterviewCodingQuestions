package String;

public class RemoveTheDuplicateInString {
    public static void main(String[] args) {
        String str = "Kalaivanan";
        for(int i=0; i<str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            boolean isDuplicate = false;
            for(int j=0; j<i; j++){
                if(str.charAt(j) == ch){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.print(ch);
            }
        }
    }
    
}
