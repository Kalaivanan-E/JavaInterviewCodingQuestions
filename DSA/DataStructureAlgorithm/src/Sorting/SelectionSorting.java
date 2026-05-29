package Sorting;

import java.util.Arrays;

// SelectionSorting -> it repeatedly find the minimum element from the unsorted array and places
//                      it correct position
public class SelectionSorting {
    static void main() {
        int [] arr = {0,5,2,9,6,7,1};
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
