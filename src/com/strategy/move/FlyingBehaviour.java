package com.strategy.move;

public class FlyingBehaviour implements MoveBehaviour {
    @Override
    public void move() {
        System.out.println("Flies when have to move");
    }
}
