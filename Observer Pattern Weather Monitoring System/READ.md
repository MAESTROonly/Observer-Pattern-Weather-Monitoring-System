Weather Monitoring System - Observer Pattern
Description
This project demonstrates the Observer Pattern by implementing a flexible weather monitoring system. In this system, a Weather Station acts as the subject, and various Display Devices (observers) update their information automatically based on the current weather data. This design allows new types of displays to be easily added without changing the core functionality of the weather station.

Key Features
Real-time weather updates (temperature, humidity, and pressure) across multiple display devices.
Dynamic registration and removal of display devices from the weather station.
Flexible architecture for adding new display types.
Includes current weather, statistics, and weather forecast displays.
Design Pattern: Observer Pattern
The Observer Pattern defines a one-to-many dependency between objects, so when the subject's state changes, all its observers are notified automatically. In this system:

WeatherStation is the subject.
WeatherDisplay is the observer interface, implemented by various display classes.
When weather data is updated in the WeatherStation, it automatically notifies all registered observers (displays).
Project Structure
bash
Копировать код
src/
├── WeatherStation.java          # Subject class that manages weather data and notifies observers
├── WeatherDisplay.java          # Observer interface with an update method
├── CurrentConditionsDisplay.java # Observer for displaying current weather conditions
├── StatisticsDisplay.java       # Observer for displaying weather statistics
├── ForecastDisplay.java         # Observer for predicting weather forecast
├── WeatherData.java             # Class that manages display devices and the weather station
└── Main.java                    # Main class demonstrating the system in action
How It Works
WeatherStation: Stores weather data and notifies observers of any changes.
WeatherDisplay Interface: Defines a common update(temperature, humidity, pressure) method, implemented by all display devices.
Display Implementations:
CurrentConditionsDisplay: Shows the current temperature, humidity, and pressure.
StatisticsDisplay: Tracks and displays the average, maximum, and minimum temperatures.
ForecastDisplay: Predicts the weather forecast based on pressure trends.