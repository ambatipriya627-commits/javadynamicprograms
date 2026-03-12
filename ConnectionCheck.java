import java.util.Random;

public class ConnectionCheck {
    public static void main(String[] args) {
        Random random = new Random();
        boolean connected = random.nextBoolean();
        if (connected) {
            System.out.println("Network is connected.");
        } else {
            System.out.println("Network is not connected.");
        }
    }
}
