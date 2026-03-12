import java.util.Scanner;
public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pwd = sc.nextLine();
        int len = pwd.length();
        boolean hasUpper = pwd.matches(".*[A-Z].*");
        boolean hasLower = pwd.matches(".*[a-z].*");
        boolean hasDigit = pwd.matches(".*[0-9].*");
        boolean hasSpecial = pwd.matches(".*[!@#$%^&*].*");
        if (len < 8) {
            System.out.println("Weak: Too short");
        } else if (hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Strong password!");
        } else {
            System.out.println("Medium: Add uppercase, lowercase, digits, special chars");
        }
        sc.close();
    }
}
