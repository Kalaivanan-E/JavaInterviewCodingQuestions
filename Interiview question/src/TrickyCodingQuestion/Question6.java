public class Question6 {

    static int i =10;
     
    public static void main(String[] args) {
        changeValue(i);
        System.out.println(i); // 10 because 
    }
    public static void changeValue(int i){
        i =50;                     // i = 50 but this will be used within the block only cannot be used in the main method
    }
}
