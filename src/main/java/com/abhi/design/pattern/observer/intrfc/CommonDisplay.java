package com.abhi.design.pattern.observer.intrfc;

import com.abhi.design.pattern.observer.impl.WeatherNotifier;
import com.abhi.design.pattern.observer.intrfc.Display;
import com.abhi.design.pattern.observer.intrfc.Observer;

public abstract class CommonDisplay implements Observer, Display {
    protected WeatherNotifier weatherNotifier;

    protected String displayMessage;

    public CommonDisplay(WeatherNotifier weatherNotifier) {
        this.weatherNotifier = weatherNotifier;
        // this will have reference to child class
        weatherNotifier.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(displayMessage);
    }
}
