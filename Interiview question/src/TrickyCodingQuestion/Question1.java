
class Test{
    int count;

    Test(){
        count++;
    }
    public void printNumber(){
        System.out.println(count);
    }
}
public class Question1{
    public static void main(String[] args) {
        Test d1 = new Test();
        Test d2 = new Test();
        Test d3 = new Test();

        d1.printNumber(); // 1
        d2.printNumber(); // 1 
        d3.printNumber(); // 1 

        // here it will print 1 for each object because count variable is instance variable
    }
}