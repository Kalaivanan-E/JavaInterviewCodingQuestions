package Searching;

//Linear search checks each element sequentially until the target is found.
//It works for unsorted arrays and has O(n) time complexity

public class LinearSearch {
    static void main() {
        int[] arr = {10, 20, 30, 40};
        int target = 30;

        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("element found in index of  : " + i);
            }
        }
    }
}
