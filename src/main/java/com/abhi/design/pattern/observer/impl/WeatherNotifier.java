package com.abhi.design.pattern.observer.impl;

import com.abhi.design.pattern.observer.intrfc.Observer;
import com.abhi.design.pattern.observer.intrfc.Subject;

import java.util.LinkedList;
import java.util.List;

public class WeatherNotifier implements Subject {

    private final List<Observer> observers;

    private int temperature;

    private int humidity;

    public WeatherNotifier(){
        this.observers = new LinkedList<>();
    }
    @Override
    public boolean registerObserver(Observer observer) {
        return observers.add(observer);
    }

    @Override
    public boolean deRegisterObserver(Observer observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(Observer::updateInformation);
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    /**
     * This method is meant to be updated with latest details
     * and this notifies all the observers
     * @param temperature
     * @param humidity
     */
    public void setMeasurements(int temperature, int humidity) {
        this.setTemperature(temperature);
        this.setHumidity(humidity);
        measurementChanged();
    }

    // Setters for temperature parameters
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
