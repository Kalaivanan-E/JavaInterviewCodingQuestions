package Basics;
/*
Input: x = 7, y = 20, z = 56
Output: 56
 */
public class LargestOfThreeNumber {

    static void main() {
        int x =7, y = 20, z = 56;
        if(x>y && x>z){
            System.out.println("The Greatest Number is "+ x);
        } else if (y>x && y>z) {
            System.out.println("The Greatest Number is "+ y);
        }else {
            System.out.println("The Greates Number is "+ z);
        }
    }
    /*
    wThe goal is to find the largest among three numbers.
    I use if-else conditions to compare the values.
    First, I check if x is greater than both y and z.
    If not, I check if y is greater than both.
    Otherwise, z is the largest.
    Then I print the greatest number.
     */
}
