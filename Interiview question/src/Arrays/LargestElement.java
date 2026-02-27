package Arrays;

import java.util.Arrays;

public class LargestElement {
    static void main() {
        int[] arr = {10, 5, 20, 8};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The Largest number in the Array : " + max);
    }
}
/*
Time complexity O(n):
    We are checking each element only once.
    If array has n elements, loop runs n-1 times.
    So time complexity = O(n) (linear time).
*/

// using streamapi

class Largestelement{
    static void main() {
        int[] arr = {10, 5, 20, 8};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}
/*
Converts array to stream
Iterates internally
Compares elements
Returns maximum
Time Complexity → O(n)*/
