package com.pb.korchevskaja.hw7;

public class Pants extends Clothes implements ManClothes, WomanClothes {

    public Pants(Size size, String price, String color) {
        super(size, price, color);
    }

    public void dressMan(){
        System.out.println("Мужские штаны, размер: " + this.size + ", цена: " + this.price + ", цвет: " + this.color);
    }
    public void dressWoman(){
        System.out.println("Женские штаны, размер: " + this.size + ", цена: " + this.price + ", цвет: " + this.color);
    }
}
