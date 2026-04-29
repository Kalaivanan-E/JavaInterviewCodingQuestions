public class Question5 {
    
    public static void main(String[] args) {
        System.out.println(fun());
    }
    static int fun(){
        static int x = 0;
        return ++x;
    }
}

// here we will get a compile time error local variable cannot be used to static keyword 
// and access modifier and abstractfor the local variable