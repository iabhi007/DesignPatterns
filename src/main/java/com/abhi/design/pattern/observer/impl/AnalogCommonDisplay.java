package com.abhi.design.pattern.observer.impl;

import com.abhi.design.pattern.observer.intrfc.CommonDisplay;
import com.abhi.design.pattern.observer.intrfc.Observer;

public class AnalogCommonDisplay extends CommonDisplay implements Observer {


    public AnalogCommonDisplay(WeatherNotifier weatherNotifier){
        super(weatherNotifier);
    }

    @Override
    public void updateInformation() {
        // weatherNotifier object is used to fetch required data
        displayMessage = "ANALOG Humidity is -> "+weatherNotifier.getHumidity() +"%";
        display();
    }
}
