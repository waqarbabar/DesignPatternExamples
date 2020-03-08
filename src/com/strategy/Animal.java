package com.strategy;

import com.strategy.display.DisplayBehaviour;
import com.strategy.eat.EatBehaviour;
import com.strategy.move.MoveBehaviour;

public class Animal {

    private DisplayBehaviour displayBehaviour;
    private MoveBehaviour moveBehaviour;
    private EatBehaviour eatBehaviour;

    public Animal(DisplayBehaviour displayBehaviour, MoveBehaviour moveBehaviour, EatBehaviour eatBehaviour) {
        this.eatBehaviour = eatBehaviour;
        this.moveBehaviour = moveBehaviour;
        this.displayBehaviour = displayBehaviour;
    }

    public void move() {
        this.moveBehaviour.move();
    }

    public void display(){
        this.displayBehaviour.display();
    }

    public void eat(){
        this.eatBehaviour.eat();
    }
}
