package com.abhi.design.pattern.observer;

import com.abhi.design.pattern.observer.impl.AnalogCommonDisplay;
import com.abhi.design.pattern.observer.impl.DigitalCommonDisplay;
import com.abhi.design.pattern.observer.impl.WeatherNotifier;
import com.abhi.design.pattern.observer.intrfc.Observer;

import java.util.Random;

public class Driver {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        // WeatherNotifier object is created
        WeatherNotifier weatherNotifier = new WeatherNotifier();

        // creating new displays
        new DigitalCommonDisplay(weatherNotifier);
        new AnalogCommonDisplay(weatherNotifier);

        // below is used to simulate the changes in weather object which in turn
        // updates the displays.
        for(int i = 0 ; i < 10 ; i++) {
            weatherNotifier.setMeasurements(random.nextInt(50), random.nextInt(100));
            Thread.sleep(1000);
        }

        // Now we can create and add new displays. The code is loosely coupled.
    }
}
