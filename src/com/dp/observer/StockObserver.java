package com.dp.observer;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private static int observerIDTRacker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTRacker;
        System.out.println("New Observer " + this.observerID);
        stockGrabber.register(this);
    }


    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
        printThePrices();
    }


    public void printThePrices() {
        System.out.println("Updating Observer : Observer "+observerID + "\nIBM :  " + ibmPrice + "\nAPPLE :  " + applePrice + "\nGOOGLE :  " + googlePrice);

    }


}
