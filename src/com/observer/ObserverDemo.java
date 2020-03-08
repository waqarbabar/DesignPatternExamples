package com.observer;

public class ObserverDemo {
    public static void main(String[] args) {

        StockExchange stockExchange = new StockExchange();
        StockBroker broker1 = new StockBroker(stockExchange);
        StockBroker broker2 = new StockBroker(stockExchange);
        StockBroker broker3 = new StockBroker(stockExchange);
        stockExchange.subscribe(broker1);
        stockExchange.subscribe(broker2);
        stockExchange.subscribe(broker3);

        stockExchange.setRate(1000);
        stockExchange.setRate(2000);
        stockExchange.setRate(3000);
        stockExchange.setRate(4000);
        stockExchange.setRate(5000);
    }
}
