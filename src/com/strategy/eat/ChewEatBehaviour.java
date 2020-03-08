package com.strategy.eat;

public class ChewEatBehaviour implements EatBehaviour {
    @Override
    public void eat() {
        System.out.println("chews before swallowing the food");
    }
}
