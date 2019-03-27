package com.dp.observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {
    private int startTime;
    private String stock;
    private double price;
    private Subject stockGrabber;

    public GetTheStock(int startTime, String stock, double price, Subject stockGrabber) {
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
        this.stockGrabber = stockGrabber;
    }


    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(startTime * 1000);
            } catch (InterruptedException e) {

            }

            double randNum = (Math.random() * (0.06)) - 0.03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format(randNum));
            if (stock.equals("IBM")) {
                ((StockGrabber) stockGrabber).setIbmPrice(price);
            }

            if (stock.equals("AAPL")) {
                ((StockGrabber) stockGrabber).setApplePrice(price);
            }

            if (stock.equals("GOOG")) {
                ((StockGrabber) stockGrabber).setGooglePrice(price);
            }

            System.out.println(stock + " : " + df.format((price + randNum)) + " " + df.format(randNum));
            System.out.println("");


        }
    }
}
