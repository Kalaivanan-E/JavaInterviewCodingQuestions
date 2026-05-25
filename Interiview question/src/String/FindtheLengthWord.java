package String;

public class FindtheLengthWord {

    public static void main(String[] args) {
        String str = "Hii I'm Kalaivanan";
        String s = str.trim();
        int count =0;
        for(int i= s.length()-1; i>=0; i--){
            if(s.charAt(i)!= ' '){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
    
}
