public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // Create displays
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        // Register displays with the weather station
        weatherData.addDisplay(currentDisplay);
        weatherData.addDisplay(statisticsDisplay);
        weatherData.addDisplay(forecastDisplay);

        // Simulate new weather data
        weatherData.setWeatherData(25.0, 65, 1010);
        weatherData.setWeatherData(28.0, 70, 1005);
        weatherData.setWeatherData(22.0, 90, 998);
    }
}
