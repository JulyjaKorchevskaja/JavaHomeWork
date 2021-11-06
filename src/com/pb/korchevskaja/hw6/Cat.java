package com.pb.korchevskaja.hw6;

import java.util.Objects;

public class Cat extends Animal {
    public int countEatMouse;

    public int getCountEatMouse() {
        return countEatMouse;
    }

    public void setCountEatMouse(int countEatMouse) {
        this.countEatMouse = countEatMouse;
    }
    public Cat(String food, String location){
        super(food, location);
    }
    @Override
    public void makeNoise() {
        System.out.println("Мяу!");
    }

    @Override
    public void eat() {
        System.out.println("Молоко");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", countEatMouse=" + countEatMouse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return countEatMouse == cat.countEatMouse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countEatMouse);
    }
}
