import java.util.Scanner;
public class WeeklySalesCalculator {
    public static void main(String[] args) {
        double[] dailySales = new double[7];
        double totalSales = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales for each day of the week:");
        for (int i = 0; i < dailySales.length; i++) {
            
            System.out.print("Day " + (i + 1) + " sales: $");
         
            dailySales[i] = scanner.nextDouble();
        }
        for (double sales : dailySales) {
            totalSales += sales;
        }
        System.out.println("\n---------");
        System.out.println("Total weekly sales: $" + totalSales);
        System.out.println("----------");

        scanner.close();
    }
}
