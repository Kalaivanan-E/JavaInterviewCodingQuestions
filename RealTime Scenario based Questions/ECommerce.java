// 1. E-commerce Payment System
// 🧠 Scenario:

// You are building a payment system like Amazon. It supports:

// Credit Card
// UPI
// Net Banking

// 👉 Each payment type has different logic

// ❓ Question:

// How will you design this using OOP?

abstract class Payment{
    abstract void pay(double amount);
}
class CreditCard extends Payment{
    void pay(double amount){
        System.out.println("Paid via Credit Card..." + amount);
    }
}
class Upi extends Payment{
    void pay(double amount){
        System.out.println("Paid via UPI" + amount);
    }
    public static void main(String[] args) {
        Upi v = new Upi();
        v.pay(2000);
    }
}