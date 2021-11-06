package com.pb.korchevskaja.hw6;

import java.util.Objects;

public class Horse extends Animal {
    public String speedRun;
    public Horse(String food, String location){
        super(food, location);
    }
    public String getSpeedRun() {
        return speedRun;
    }

    public void setSpeedRun(String speedRun) {
        this.speedRun = speedRun;
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го!");
    }

    @Override
    public void eat() {
        System.out.println("Трава");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", speedRun='" + speedRun + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(speedRun, horse.speedRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speedRun);
    }
}
