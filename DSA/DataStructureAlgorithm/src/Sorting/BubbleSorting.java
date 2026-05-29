package Sorting;



import java.util.Arrays;

// BubbleSorting -> is sorting algorithm it will repeatedly compare the adjacent element and swap them
//                  if the order is wrong.
public class BubbleSorting {

    static void main() {
        int [] arr = {5,2,4,3,6,0};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// j<arr.length-i-1; ==> because the largest element moves to the end of array, after each pass