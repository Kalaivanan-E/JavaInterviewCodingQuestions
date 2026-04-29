
class Vehicle{
    public void drive(){
        System.out.println("Vehicle driving");
    }
}
class Car extends Vehicle{
    public void drive(){
        System.out.println("Car driving");
    }
    public static void main(String[] args) {
        Car t1 = new Vehicle();  // here we will get compile time error because car is child type it cannot hold parent 
        t1.drive();
    }
}