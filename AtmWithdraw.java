import java.util.Scanner;
public class AtmWithdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 50000;
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount < 100) {
            System.out.println("Minimum withdrawal is Rs.100");
        } else if (amount % 100 != 0) {
            System.out.println("Amount must be multiple of 100");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: Rs." + balance);
        }
        sc.close();
    }
}
