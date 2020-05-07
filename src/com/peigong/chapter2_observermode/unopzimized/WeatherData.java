package com.peigong.chapter2_observermode.observermode.unopzimized;

/**
 * @author: lilei
 * @create: 2020-05-02 10:21
 **/
public class WeatherData {

    CurrentConditionsDisplay currentConditionsDisplay;
    StatisticsDisplay statisticsDisplay;
    ForecastDisplay forecastDisplay;

    public float getTemperature(){
        return 0f;
    }

    public float getHumidity(){
        return 0f;
    }

    public float getPressure(){
        return 0f;
    }

    public void measurementsChanged(){
        float temp = getTemperature();
        float humi = getHumidity();
        float press = getPressure();
        currentConditionsDisplay.update(temp, humi, press);
        statisticsDisplay.update(temp, humi, press);
        forecastDisplay.update(temp,humi,press);
    }

}
