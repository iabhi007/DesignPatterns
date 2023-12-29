package com.abhi.design.pattern.observer.intrfc;

import com.abhi.design.pattern.observer.intrfc.Observer;

/**
 * Standard Subject
 */
public interface Subject {

    boolean registerObserver(Observer observer);

    boolean deRegisterObserver(Observer observer);

    void notifyObserver();
}
