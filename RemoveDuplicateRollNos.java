import java.util.*;
public class RemoveDuplicateRollNos 
    public static void main(String[] args) {
        int[] rolls = {101, 102, 101, 103, 104, 102, 105};
        Set<Integer> unique = new LinkedHashSet<>();
        for (int r : rolls) {
            unique.add(r);
        }
        System.out.println("Unique roll numbers: " + unique);
    }
}
