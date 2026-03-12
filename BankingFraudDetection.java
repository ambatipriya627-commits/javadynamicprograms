
public class BankingFraudDetection {
    public static void main(String[] args) {
        double[] txns = {5000, 20000, 70000, 120000, 1500, 300000};
        double amountThreshold = 100000; 
        int frequencyThreshold = 3;      

        System.out.println("Suspicious (large) transactions:");
        for (double t : txns) {
            if (t > amountThreshold) {
                System.out.println("Amount: " + t);
            }
        }

        if (txns.length > frequencyThreshold) {
            System.out.println("High frequency pattern detected: " + txns.length + " transactions");
        }
    }
}
