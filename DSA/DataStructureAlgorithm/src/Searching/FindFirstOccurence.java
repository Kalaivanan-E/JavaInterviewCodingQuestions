
/*
arr = [1,2,2,2,3,4]
target = 2

Output: 1

 */

public class FindFirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4};
        int target = 2;
        int result = -1;
        int left =0,right = arr.length-1;
        while (left<=right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                result = mid;
                right = mid -1;
                
            }
            else if (arr[mid]<target){
                left = mid +1;
             }
            else {
                right = mid -1;
            }
        }
        System.out.println(result);
    }
}

//I used modified binary search.
//  When I find the target, I don’t stop—I continue searching on the left side to get the first occurrence.