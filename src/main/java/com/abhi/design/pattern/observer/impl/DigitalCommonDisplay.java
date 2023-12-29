package com.abhi.design.pattern.observer.impl;

import com.abhi.design.pattern.observer.intrfc.CommonDisplay;
import com.abhi.design.pattern.observer.intrfc.Observer;


public class DigitalCommonDisplay extends CommonDisplay implements Observer {

    public DigitalCommonDisplay(WeatherNotifier weatherNotifier){
        super(weatherNotifier);
    }

    @Override
    public void updateInformation() {
        // weatherNotifier object is used to fetch required data
        displayMessage = "DIGITAL Temperature is -> "+weatherNotifier.getTemperature() +" C";
        display();
    }
}
