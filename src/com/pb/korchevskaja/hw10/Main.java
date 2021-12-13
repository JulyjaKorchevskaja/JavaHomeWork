package com.pb.korchevskaja.hw10;


public class Main {
    public static void main(String [] args){
        NumBox<Integer> numbersInteger = new NumBox(7);
        NumBox<Float> numbersFloat = new NumBox(8);
        numbersInteger.add(3);
        numbersInteger.add(2);
        numbersInteger.add(3);
        numbersInteger.add(4);
        numbersInteger.add(5);
        numbersInteger.add(6);
        numbersFloat.add((float) 15.1);
        numbersFloat.add((float) 15.2);
        numbersFloat.add((float) 15.8);
        numbersFloat.add((float) 75.4);
        numbersFloat.add((float) 15.5);
        numbersFloat.add((float) 15.6);
        System.out.println(numbersInteger.average());
        System.out.println(numbersFloat.average());
    }
}
