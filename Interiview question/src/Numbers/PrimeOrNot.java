package Numbers;

    public class PrimeOrNot {
        static void main() {
            int n = 25;
            boolean isprime = true;

            for(int i=2; i<n/2; i++){
                if(n%i == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println("The given number is prime ");
            }else {
                System.out.println("The given number is not prime");
            }
        }
    }
    /*
    I assume the number is prime initially. Then I check divisibility from 2 up to n/2.
    If the number is divisible by any value, I mark it as not prime and break the loop.
    Finally I print the result."
    */