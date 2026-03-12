import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> transactions = new ArrayList<>();
        int balance = 10000;
        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Even Transaction Count & Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.print("Enter amount: ");
                int amount = sc.nextInt();
                if (choice == 1) balance += amount;
                else balance -= amount;
                
                transactions.add(amount);
                System.out.println("Transaction recorded.");
            } else if (choice == 3) {
        
                int evenCount = 0;
                for (int trans : transactions) {
                    if (trans % 2 == 0) {
                        evenCount++;
                    }
                }
                System.out.println("\nTotal transactions: " + transactions.size());
                System.out.println("Even amount transactions: " + evenCount);
                break;
            }
        }
        sc.close();
    }
}
