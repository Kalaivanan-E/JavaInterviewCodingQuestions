
// Write a program to print the first non-repeated character from a given String.

public class FirstNonRepeatedChar {
    static void main() {
        String str = "Software Service";
        for(int i =0; i<str.length(); i++){

            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            int count = 0;
            for(int j =0; j<str.length(); j++){
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            if(ch == 1){
                System.out.println(ch);
                break;
            }
        }
    }
}

/*
    I used nested loop where the outer loop select each character and inner loop
    count its occureness in the string. if count becames 1, that character is the
    first non repeated character and then i terminate using break
 */