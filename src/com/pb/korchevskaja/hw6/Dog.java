package com.pb.korchevskaja.hw6;

import java.util.Objects;

public class Dog extends Animal{
    public String scentPower;
    public Dog(String food, String location){
        super(food, location);
    }

    @Override
    public void makeNoise(){
        System.out.println("Гав!");
    }
    @Override
    public void eat(){
        System.out.println("Мясо");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", scentPower='" + scentPower + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(scentPower, dog.scentPower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scentPower);
    }
}
