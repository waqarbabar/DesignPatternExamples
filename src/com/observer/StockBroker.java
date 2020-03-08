package com.observer;

public class StockBroker implements Observer {

    private StockExchange stockExchange;

    public StockBroker(StockExchange stockExchange) {
        this.stockExchange = stockExchange;
    }

    @Override
    public void update() {
        System.out.println("New rate ("+this.stockExchange.getRate()+") received on broker end");
    }
}
