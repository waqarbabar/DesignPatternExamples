package com.strategy;

import com.strategy.display.LargeDisplayBehaviour;
import com.strategy.display.SmallDisplayBehaviour;
import com.strategy.eat.ChewEatBehaviour;
import com.strategy.eat.SwallowEatBehaviour;
import com.strategy.move.FlyingBehaviour;
import com.strategy.move.WalkingBehaviour;

public class StrategyDemo {

    public static void main(String[] args) {
        Animal dog = new Animal(new LargeDisplayBehaviour(), new WalkingBehaviour(), new ChewEatBehaviour());
        dog.display();
        dog.eat();
        dog.move();
        Animal duck = new Animal(new SmallDisplayBehaviour(), new FlyingBehaviour(), new SwallowEatBehaviour());
        duck.eat();
        duck.move();
        duck.display();
        Animal cat = new Animal(new SmallDisplayBehaviour(), new WalkingBehaviour(), new ChewEatBehaviour());
        cat.move();
        cat.eat();
        cat.display();
    }
}
