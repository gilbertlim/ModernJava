package com.megazone.modern.BehaviorParameterization;

import static com.megazone.modern.BehaviorParameterization.BehaviorParameterization.Color.RED;

public class AppleRedAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return RED.toString().equals(apple.getColor())
                && apple.getWeight() > 110;
    }
}
