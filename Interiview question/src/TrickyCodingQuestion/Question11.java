import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Stay Inside"; // this is store in scp memory
        String str2 = sc.nextLine(); // this is will store in heap memory bcz its object and runtime
        System.out.println(str1 == str2);
    }
    
}
