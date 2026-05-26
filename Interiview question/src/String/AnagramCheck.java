package String;

import java.util.Arrays;

public class AnagramCheck {
   public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silents";
        if(s1.length() != s2.length()){
            System.out.println("Not anagram");
            return;
        }
        int count[] = new int[26];

        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
        }
        for(int i =0; i<s2.length(); i++){
            count[s2.charAt(i) - 'a']--;
        }
        for(int i=0; i<count.length; i++){
            if(count[i] !=0 ){
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("anagram");
    }
}
