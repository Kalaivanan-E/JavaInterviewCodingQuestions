package Basics;
/*
Input  : m=9, n=5
Output : m=5, n=9

Input  : m=15, n=5
Output : m=5, n=15
*/
public class SwapTwoNumbers {

    static void main() {
        int m = 9, n =5;
        int temp = m;
        m = n;
        n = temp;
        System.out.println(m + " " + n);
    }
    /*
    I’m swapping two integers using a temporary variable.
    I store m in temp, assign n to m, and then assign temp back to n.
    This swaps their values, and the output will be 5 and 9.”
*/
    // without using third variable

    static  void withoutThirdVar(){
        int m = 5, n =9;
        m = m +n;
        n = m-n;
        m = m-n;
        System.out.println(m + " " + n);
    }

    /*
    “The goal is to swap two integers without using a temporary variable.
    I use arithmetic operations for this. First, I add both values and store the result in m.
    Then I subtract the new m with n to get the original value of m, which is assigned to n.
    Finally, I subtract again to get the original value of n into m.
        So the values are successfully swapped.
     */
}
