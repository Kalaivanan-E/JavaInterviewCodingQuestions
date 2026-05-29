package Arrays;

import java.util.Arrays;

//input = [1, 2, 3, 4, 5]
//output = [2,3,4,5,1]
public class LeftRotateArray {
    static void main() {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        int temp = arr[0];
        for(int i=1; i<n; i++ ){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
