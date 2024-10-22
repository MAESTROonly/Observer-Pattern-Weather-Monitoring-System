public class StatisticsDisplay implements WeatherDisplay {
    private double maxTemp = 0.0;
    private double minTemp = 100.0;
    private double tempSum = 0.0;
    private int numReadings;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        System.out.println("Avg/Max/Min temperature: " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp + "°C.");
    }
}
