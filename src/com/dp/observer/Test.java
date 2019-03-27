package com.dp.observer;

public class Test {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver obs1 = new StockObserver(stockGrabber);
        StockObserver obs2 = new StockObserver(stockGrabber);
        StockObserver obs3 = new StockObserver(stockGrabber);
        StockObserver obs4 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplePrice(193.00);
        stockGrabber.setGooglePrice(194.00);
        Runnable getIBM = new GetTheStock(3, "IBM", 197.00, stockGrabber);
        Runnable getAAPL = new GetTheStock(4, "AAPL", 193.00, stockGrabber);

        Runnable getGOOG = new GetTheStock(1, "GOOG", 194.00, stockGrabber);
        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();

    }
}
