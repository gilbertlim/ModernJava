package com.megazone.modern.BehaviorParameterization.Vanilla;

import com.megazone.modern.BehaviorParameterization.Apple;
import com.megazone.modern.BehaviorParameterization.ApplePredicate;
import lombok.RequiredArgsConstructor;

import static com.megazone.modern.BehaviorParameterization.ColorConfig.Color.RED;

@RequiredArgsConstructor
public class AppleRedAndHeavyPredicate implements ApplePredicate {


    @Override
    public boolean test(Apple apple) {
        return RED.toString().equals(apple.getColor())
                && apple.getWeight() > 110;
    }
}
