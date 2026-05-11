

// write a program to print LastNonRepeatedCharacter in the string?

public class LastNonRepeatedCharacter {
    static void main() {
        String str = "Software Service";

        for(int i = str.length()-1; i>0; i++){
            char ch = str.charAt(i);

            if(ch == ' '){
                continue;
            }
            int count = 0;
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(ch);
                break;
            }
        }
    }
}