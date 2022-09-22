package com.megazone.modern.Generic;


import java.util.Arrays;
import java.util.Stack;

public class GenericUse {

    public static void use() {

        // class
        GenericClass<String> stringObj = new GenericClass<>("abc");
        System.out.println("stringMadPlay.getVal() = " + stringObj.getVal());
        GenericClass<Integer> integerObj = new GenericClass<>(1);
        System.out.println("stringMadPlay.getVal() = " + integerObj.getVal());

        // interface
        GenericImpl<String> genericImpl= new GenericImpl<>();
        genericImpl.addElement("abc", 0);
        System.out.println("genericImpl.getElement(0) = " + genericImpl.getElement(0));;

        // method
        String[] array = new String[] {"a", "b", "c"};
        Stack<String> stack = new Stack<>();
        arrayToStack(array, stack);
        System.out.println("stack.get(0) = " + stack.get(0));
    }

    public static <T> void arrayToStack(T[] arr, Stack<T> stack) {
        stack.addAll(Arrays.asList(arr));
    }

}
