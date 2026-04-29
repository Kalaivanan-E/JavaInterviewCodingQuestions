
class Vehicle{
    public void drive(){
        System.out.println("Vehicle driving");
    }
}
class Car extends Vehicle{
    public void drive(){
        System.out.println("Car driving");
    }
    public void playMusic(){
        System.out.println("Playing Music in the car");
    }
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive(); // car driving,  drive() will override the parent class method
        v.playMusic(); // here we will get compile time error because playMusic() 
        // is not valiable in partent class here we are taking parent class reference
    }
}