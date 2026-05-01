// 🧠 Scenario:

// Different ride types:

// Mini
// Sedan
// SUV

// Each has different pricing.

// ❓ Question:

// Design fare calculation.


abstract class ride{
    abstract double calculationFare(int distance);
}
class Mini extends ride{
    double calculationFare(int distance){
        return distance * 10;
    }
}
class SUV extends ride{
    double calculationFare(int distance){
        return distance * 15;
    }
}