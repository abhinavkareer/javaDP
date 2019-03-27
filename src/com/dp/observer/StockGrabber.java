package com.dp.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int oInd = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (oInd + 1) + " deleted");
        observers.remove(oInd);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, applePrice, googlePrice);
        }
    }

    public void setIbmPrice(double newIbmPrice) {
        ibmPrice = newIbmPrice;
        notifyObserver();
    }

    public void setApplePrice(double newApplePrice) {
        applePrice = newApplePrice;
        notifyObserver();
    }

    public void setGooglePrice(double newGooglePrice) {
        googlePrice = newGooglePrice;
        notifyObserver();
    }

}
