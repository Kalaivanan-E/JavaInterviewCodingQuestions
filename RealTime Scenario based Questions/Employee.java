// 🧠 Scenario:

// In a company system:

// Employee → can view tasks
// Manager → can assign tasks
// Admin → full access
// ❓ Question:

// Design using OOP.

class Employee{
    void access(){
        System.out.println("View Tasks");
    }
}
class Manager extends Employee{
    void access(){
        System.out.println("Assign Tasks");
    }
}
class Admin extends Manager{
    void access(){
        System.out.println("Full access");
    }
    public static void main(String[] args) {
        Admin a2 = new Admin();
        a2.access();
        Employee e1 = new Admin();
        e1.access();
    }
}