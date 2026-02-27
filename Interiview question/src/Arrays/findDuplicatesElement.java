package Arrays;

import java.util.HashSet;

public class findDuplicatesElement {
//    static void main() {
//        int[] arr = {1,2,3,4,2,5};
//        HashSet<Integer> set = new HashSet<>();
//        for(int num : arr){
//            if(!set.add(num)){  // if element is new -> return true, if element already exist -> return false;
//                System.out.println("Duplicates : " + num);
//            }
//        }
static void main(){
    int[] arr = {1,2,3,4,2,5};
    for(int i =0; i<arr.length; i++){
        for(int j= i+1; j<arr.length; j++){  // We don’t want to compare same element again,We already compared previous elements
            if(arr[i] == arr[j]){
                System.out.println("Duplicates : " + arr[i]);
            }
        }
    }
}

    }


