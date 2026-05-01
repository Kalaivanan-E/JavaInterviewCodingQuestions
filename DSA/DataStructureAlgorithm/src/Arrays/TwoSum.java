package Arrays;
//
//Input:
//nums = [2, 7, 11, 15]
//target = 9
//
//Output:
//        [0, 1]
public class TwoSum {

    static void main() {
        int[] nums = {2,7,11,15};
        int target = 9;

        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
/*
I used two loops to check all pairs.
The first loop picks one element, and the second loop checks the remaining elements.
If their sum equals the target, I print the indices.
This approach takes O(n²) time
*/