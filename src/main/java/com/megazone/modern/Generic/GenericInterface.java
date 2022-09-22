package com.megazone.modern.Generic;

public interface GenericInterface<T> {
    void addElement(T t, int index);

    T getElement(int index);
}
