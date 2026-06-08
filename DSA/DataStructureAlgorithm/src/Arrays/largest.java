package Arrays;

public class largest {
    static void main() {
        int[] arr = {199,121,123,4454,655,5895,989,124};
        int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}

