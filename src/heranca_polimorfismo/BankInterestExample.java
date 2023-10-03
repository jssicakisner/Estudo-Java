package heranca_polimorfismo;

/*Sample Exercise extrated from the Study Guide v2.0 provided by REVATURE

Consider a scenario where Bank is a class that provides functionality to get the rate of interest. However, 
the rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest. 

Go ahead and code the above scenario.  */

public class BankInterestExample {
    public static void main(String[] args) {
        Bank sbiBank = new SBI();
        Bank iciciBank = new ICICI();
        Bank axisBank = new AXIS();

        System.out.println("Interest Rate from SBI: " + sbiBank.getRateOfInterest() + "%");
        System.out.println("Interest Rate from ICICI: " + iciciBank.getRateOfInterest() + "%");
        System.out.println("Interest Rate from AXIS: " + axisBank.getRateOfInterest() + "%");
    }
}
