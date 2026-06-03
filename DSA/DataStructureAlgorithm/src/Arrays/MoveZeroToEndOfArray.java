package Arrays;

import java.util.Arrays;

public class MoveZeroToEndOfArray {
    static void main() {
        int[] arr = {1,0,2,0,5,0,4,6,0,};
        int n = arr.length;
        int [] temp = new int[n];
        int index =0;
        for(int i=0; i<n;i++){
            if(arr[i] !=0){
                temp[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
