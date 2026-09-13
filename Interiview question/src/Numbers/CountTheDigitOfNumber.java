




public class CountTheDigitOfNumber {
    public static void main(String[] args) {
        // find the digit of the number
        int num = 1234;
        int count =0;
        while(num>0){
            count++;
            num = num/10;
        }
        System.out.println(count);

    }
}