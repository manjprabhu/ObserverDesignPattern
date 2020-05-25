package com.btk.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void update() {
        notifyObservers();
    }

    private void notifyObservers() {
        for(Observer observer : observerList) {
            observer.show();
        }
    }
}
