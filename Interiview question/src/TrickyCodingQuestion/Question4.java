

class Vehicle{
    int maxSpeed = 200;
    public static void drive(){
        System.out.println("Driving Vehicle......");
    }
    public void race(){
        System.out.println("Driving at  Speed "+ maxSpeed);
    }
}
class Car extends Vehicle{
    int maxSpeed = 180;
    public static void drive(){
        System.out.println("Driving car...........");
    }
    public void race(){
        System.out.println("Driving at speed  "+ maxSpeed);
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive(); // driving vehicle.. because static method cannot be override
        v.race(); // driving car ...
        System.out.println(v.maxSpeed);  // 180 it will hide the parent class variable and show the child class variable
    }
}

// 1. static
// 2. private
// 3. final 
// 4. variable these all are cannot be overridden