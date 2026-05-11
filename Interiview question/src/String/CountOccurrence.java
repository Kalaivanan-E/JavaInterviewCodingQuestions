

//Write a program to count the number of occurrences of each character in a string
//Input = apple, Output = a=1,p=2,l=1,e=1;

public class CountOccurrence {
    static void main() {
        String str = "apple";
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            int count = 0;
            for(int j =0; j<str.length; j++){
                if(str.charAt(j) == ch){
                    count ++;
                }
            }
            System.out.println(ch + ' = ' + count);
        }
    }
}