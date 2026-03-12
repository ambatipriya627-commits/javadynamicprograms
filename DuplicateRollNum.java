import java.util.Arrays;
import java.util.Scanner;

public class DuplicateRollNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rollNumbers = {101, 102, 101, 103, 104, 102, 105, 103, 106};
        System.out.println("ORIGINAL: " + Arrays.toString(rollNumbers));
        System.out.println("============");
        
        detectDuplicatesBySorting(rollNumbers);
        
        System.out.print("\nEnter roll numbers: ");
        String input = sc.nextLine();
        String[] parts = input.trim().split("\\s+");
        int[] userData = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            userData[i] = Integer.parseInt(parts[i]);
        }
        detectDuplicatesBySorting(userData);
        
        sc.close();
    }
    public static void detectDuplicatesBySorting(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        System.out.println("SORTED:   " + Arrays.toString(sorted));
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] == sorted[i-1] && !duplicates.contains(sorted[i])) {
                duplicates.add(sorted[i]);
            }
        }
        
        if (duplicates.isEmpty()) {
            System.out.println("✅ No duplicates found!");
        } else {
            System.out.println("🔍 DUPLICATES FOUND: " + duplicates);
        }
        System.out.println();
    }
}
