package Basics;

public class PrimeNumber {

    static void main() {
        int n = 8;
        boolean isprime = true;

        for(int i = 2; i<n/2; i++){
            if(n%i == 0){
                isprime = false;
                break;
            }
        }
        if(isprime){
            System.out.println("The Given number is prime..");
        }else {
            System.out.println("The Given number is not prime....");
        }
    }

    /*
    The goal is to check whether a number is prime.
    I assume the number is prime initially.
    Then I check divisibility from 2 up to n/2.
    If the number is divisible by any value, it’s not prime.
    Otherwise, it is prime
     */
}
