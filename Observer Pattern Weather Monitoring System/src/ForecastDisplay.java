public class ForecastDisplay implements WeatherDisplay {
    private double lastPressure;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.print("Forecast: ");
        if (pressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (pressure == lastPressure) {
            System.out.println("More of the same.");
        } else {
            System.out.println("Watch out for cooler, rainy weather.");
        }
        lastPressure = pressure;
    }
}

