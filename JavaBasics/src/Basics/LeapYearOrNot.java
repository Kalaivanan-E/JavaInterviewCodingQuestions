package Basics;

public class LeapYearOrNot {
    static void main() {
        int year = 2004;
        boolean isLeapYear = false;
        //if year is divisible by 4
        if(year %4 ==0 ){
            isLeapYear = true;
            //to identify whether it is a century or not
            if(year %100 ==0){
                // checking if year divisible by 400
                if(year%400 == 0){
                    isLeapYear = true;
                }else {
                    isLeapYear = false;
                }
            }
        }else {
            isLeapYear = false;
        }
            if (isLeapYear) {
                System.out.println("The given year is Leap year");
            } else {
                System.out.println("The given year is not Leap year");
            }

    }
}

/*
The goal is to check whether a given year is a leap year.
A year is a leap year if it is divisible by 4.
However, if it is a century year (divisible by 100), it must also be divisible by 400 to be a leap year.
Based on these conditions, I determine and print whether the year is a leap year or not
 */