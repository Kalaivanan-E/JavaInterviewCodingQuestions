

 package String;

class FirstIndexOfOccurencesIndex {

    public static void main(String[] args) {
        String str = "sadbutsad";
        String str2 = "but";
        int result = -1;

        for(int i=0; i<str.length()-str2.length()+1; i++){
            if(str.charAt(i) == str2.charAt(0)){
                if(str.substring(i, str2.length()+i).equals(str2)){
                    result = i;
                    break;
                }
            }
        }
        System.out.println(result);
       
    }
}