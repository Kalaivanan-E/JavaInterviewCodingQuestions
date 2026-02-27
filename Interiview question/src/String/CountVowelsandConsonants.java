package String;

public class CountVowelsandConsonants {
    static void main() {
        String str = "kalaivanan";
        int vowels =0,consonants =0;
        for(char c : str.toCharArray()){
            if("aeiou".indexOf(c)!= -1){
                vowels ++;
            }else {
                consonants++;
            }
        }
        System.out.println("Vowels :  "+ vowels);
        System.out.println("Consonants :  "+ consonants);
    }
}
/*

Step 4: "aeiou".indexOf(c) != -1
This is important 👇
        "aeiou" is a string
indexOf(c) checks if character exists
If character exists → returns index (0,1,2...)
If not exists → returns -1
*/
