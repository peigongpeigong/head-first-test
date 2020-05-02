package com.peigong.observermode.optimization;

/**
 * @author: lilei
 * @create: 2020-05-02 10:57
 **/
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay cd = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(20, 20, 20);
        weatherData.setMeasurements(30, 30, 30);
        weatherData.setMeasurements(55,55,55);
    }
}
