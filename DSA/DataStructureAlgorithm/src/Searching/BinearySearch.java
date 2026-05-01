package Searching;
// Binary search works on sorted arrays by dividing the search space into halves.
// It has O(log n) time complexity, making it much faster than linear search

public class BinearySearch {

    static void main() {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int left = 0, right = arr.length-1;
        while (left<=right){
            int mid = (left + right) /2;
            if(arr[mid] == target){
                System.out.println("Found at "+ mid);
                return;
            }
            else if (arr[mid]<target){
                left = mid +1;
            }
            else {
                right = mid -1;
            }
        }
    }
}
