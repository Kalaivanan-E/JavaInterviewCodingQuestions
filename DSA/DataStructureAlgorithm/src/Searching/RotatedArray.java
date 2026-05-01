/*
arr = [4,5,6,7,0,1,2]
target = 0

Output: 4
 */
public class RotatedArray {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Found index at : " + i);
            }
        }
    }
    
}
