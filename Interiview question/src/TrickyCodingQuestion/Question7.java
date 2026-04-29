public class Question7 {
    public static void main(String[] args) {
        String str1 = "hello", str2 = "Java";
        int i =10, j = 20;

        System.out.println(i+j); // 30
        System.out.println("i + j"); // i +j
        System.out.println(str1 + i ); // hello 10
        System.out.println(str1 + i + j); //  hello020
        System.out.println(i +j + str1); //30 hello
        System.out.println(str1 + i * j); // hello200
        // System.out.println(str1 + i -j); compile error
        System.out.println(str1 + i + j + str2);  // hello1020java
        
    }
}
