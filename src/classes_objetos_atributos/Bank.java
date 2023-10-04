package classes_objetos_atributos;

abstract class Bank {
    abstract double getRateOfInterest();
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

class PNB extends Bank {
    @Override
    double getRateOfInterest() {
        return 5.0;
    }
}