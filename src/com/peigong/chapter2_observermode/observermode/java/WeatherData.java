package com.peigong.chapter2_observermode.observermode.java;

import java.util.Observable;

/**
 * @author: lilei
 * @create: 2020-05-02 10:48
 **/
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
