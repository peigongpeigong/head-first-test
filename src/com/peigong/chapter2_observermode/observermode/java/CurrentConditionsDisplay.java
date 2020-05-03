package com.peigong.chapter2_observermode.observermode.java;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: lilei
 * @create: 2020-05-02 10:53
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度：" + temperature + "，湿度：" + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData wd = (WeatherData) o;
        this.temperature = wd.getTemperature();
        this.humidity = wd.getHumidity();
        display();
    }
}
