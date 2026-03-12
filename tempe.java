public class tempe {
    public static void main(String[] args) {
        double[] temperatures = {25.5, 24.1, 23.0, 22.5, 21.8, 20.5, 21.0, 22.3, 25.8, 28.1, 30.2, 31.5};
        double minTemperature = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < minTemperature) {
                minTemperature = temperatures[i];
            }
        }
        System.out.println("The minimum temperature of the day is: " + minTemperature + "°C");
    }
}
