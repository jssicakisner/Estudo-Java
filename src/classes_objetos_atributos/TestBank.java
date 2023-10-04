package classes_objetos_atributos;

public class TestBank {
    public static void main(String[] args) {
        Bank sbiBank = new SBI();
        Bank pnbBank = new PNB();

        double sbiInterestRate = sbiBank.getRateOfInterest();
        double pnbInterestRate = pnbBank.getRateOfInterest();

        System.out.println("SBI Bank Interest Rate: " + sbiInterestRate + "%");
        System.out.println("PNB Bank Interest Rate: " + pnbInterestRate + "%");
    }
}
