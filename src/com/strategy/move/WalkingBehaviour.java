package com.strategy.move;

public class WalkingBehaviour implements MoveBehaviour {
    @Override
    public void move() {
        System.out.println("Walks when have to move");
    }
}
