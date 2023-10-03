package heranca_polimorfismo;

public class Bank {
    float getRateOfInterest() {
        return 0.0f; // Default interest rate for the base class (Bank)
    }
}

class SBI extends Bank {
    @Override
    float getRateOfInterest() {
        return 8.0f; // SBI's interest rate
    }
}

class ICICI extends Bank {
    @Override
    float getRateOfInterest() {
        return 7.0f; // ICICI's interest rate
    }
}

class AXIS extends Bank {
    @Override
    float getRateOfInterest() {
        return 9.0f; // AXIS's interest rate
    }
}
