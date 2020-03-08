package com.observer;

import java.util.ArrayList;
import java.util.List;

public class StockExchange implements Observable {

    List<Observer> observers;
    public Integer rate;

    public StockExchange() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(Observer::update);
    }
    public Integer getRate (){
        return this.rate;
    }

    public void setRate(Integer rate){
        System.out.println("Rate changed from "+this.rate+" to "+rate+" in the stock market");
        this.rate = rate;
        this.notifyObservers();
    }

}
