import java.util.Scanner;

public class StudentFailureCounter {
    public static void main(String[] args) {
        int passingMark = 50;
        int totalStudents = 5;
      int failedStudentsCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks for " + totalStudents + " students (0-100):");

        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Enter mark for student " + i + ": ");
            int marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid Marks! Please enter a score between 0 and 100.");
            
                i--;
                continue;
            }

            if (marks < passingMark) {
                failedStudentsCount++;
            }
        }
        scanner.close();
        System.out.println("\nNumber of students passed: " + (totalStudents - failedStudentsCount));
        System.out.println("Number of students failed: " + failedStudentsCount);
    }
}
