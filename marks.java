import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        int max = marks[0];
        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("Highest marks in the class: " + max);

        sc.close();
    }
}
