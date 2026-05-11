
// Write a program to remove the duplicate character in the string
// Input = Kalaivanan, Output = kalivn

public class RemoveDuplicateChar {
    static void main() {
        String str = "kalaivanan";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            int count = 0;
            for(int j = 0; j<i; j++){
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            if(count == 0){
                System.out.print(ch);
            }
        }
    }
}