package Basics;

public class OddOrEven {

    static void main() {
        int n = 30;
        if(n%2 == 0){
            System.out.println("Even number..." );
        }else {
            System.out.println("Odd number");
        }
    }
    /*
    The goal is to check whether a number is even or odd.
    I use the modulus operator to divide the number by 2.
    If the remainder is 0, the number is even; otherwise, it is odd.
     */
}
