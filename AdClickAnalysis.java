public class AdClickAnalysis {
    public static void main(String[] args) {
        String[] clicks = {"Chittoor", "Delhi", "Chittoor", "Chennai", "Chittoor"};
        String localCity = "Chittoor";
        int count = 0;
        for (String c : clicks) {
            if (c.equalsIgnoreCase(localCity)) {
                count++;
            }
        }
        System.out.println("Local clicks from " + localCity + ": " + count);
    }
}
