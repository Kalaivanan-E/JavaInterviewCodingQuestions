package Basics;
/*
Input :  x = "110", y = "011"
Output: "1001"
Explanation:
        110
        + 011
        =1001
*/
public class AddTwoBinaryString {

    static void main() {
        String x = "110";
        String y = "011";

        int num1 = Integer.parseInt(x,2);
        int num2 = Integer.parseInt(y,2);
        int sum = num1 + num2;
        System.out.println(Integer.toBinaryString(sum));
    }

    /*
    The goal is to add two binary strings.
    First, I convert both binary strings into integers using base 2.
    Then I add those integers.
    Finally, I convert the result back into a binary string and print it
     */

}
