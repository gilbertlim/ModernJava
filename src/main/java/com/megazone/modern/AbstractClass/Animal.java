package com.megazone.modern.AbstractClass;

import lombok.Setter;

public class Animal {

    @Setter
    String name;

    void printName() {
        System.out.println("name");
    }
}
