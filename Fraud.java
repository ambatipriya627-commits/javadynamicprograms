public class Fraud {
    public static void main(String[] args) {
        double[] transactions = {500, 25000, 1000, 75000, 2000, 150000};
        double threshold = 50000;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > threshold) {
                System.out.println("FRAUD ALERT: Transaction " + (i+1) + " = Rs." + transactions[i]);
            } else if (transactions[i] < 100) {
                System.out.println("Suspicious small txn: " + transactions[i]);
            } else {
                System.out.println("Transaction " + (i+1) + ": OK");
            }
        }
    }
}
