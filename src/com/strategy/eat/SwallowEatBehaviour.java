package com.strategy.eat;

public class SwallowEatBehaviour implements EatBehaviour {
    @Override
    public void eat() {
        System.out.println("Swallows the food without chewing");
    }
}
