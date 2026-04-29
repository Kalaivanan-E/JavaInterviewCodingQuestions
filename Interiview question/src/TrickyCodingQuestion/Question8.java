public class Question8 {

    public static void main(String[] args) {
        System.out.println(fun());
    }
    public int fun(){
        return 20;
    }
    
}
// in the above program we will get compile time error because
// whatever function or variable we are using that has to be static 
//     because main method is static method

class Question9{
    static int i = 20;
    public static void main(String[] args) {
        int i = 30; 
        System.out.println(i); // 30 will be printed because local variable has the higher priority
    }
}