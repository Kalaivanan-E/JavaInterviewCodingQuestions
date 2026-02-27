package Arrays;

public class ReverseArray {
    static void main() {
        int[] arr = {10, 20, 5, 8, 15};
        int first = 0;
        int last = arr.length-1;
        while (first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for (int num : arr){
            System.out.print(num +" ");
        }
    }
}
/*
Swap first and last
Move inward
Time Complexity → O(n)
*/
