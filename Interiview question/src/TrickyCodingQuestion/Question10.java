
// i want to print number divisible by 5 or 3 from 1 to 20 

public class Question10 {

    public static void main(String[] args) {
        for(int i =1; i<=20; i++){
            if(i%3==0 || i%5 ==0){
                System.out.println(i);
            }
        }
    }
    
}
