package Arrays;

public class SecondLargestElement {
    static void main() {
        int[] arr = {10, 20, 5, 8, 15};
        int first = 0;
        int second =0;
        for(int num : arr){
            if(num>first){
                first = num;
            } else if (num>second && num != first) {
                second = num;
            }
        }
        System.out.println("Second Largest No : " + second);
    }
}
