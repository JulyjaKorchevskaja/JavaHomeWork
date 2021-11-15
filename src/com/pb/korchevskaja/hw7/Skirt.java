package com.pb.korchevskaja.hw7;

public class Skirt extends Clothes implements WomanClothes {

    public Skirt(Size size, String price, String color) {
        super(size, price, color);
    }
    public void dressWoman(){
        System.out.println("Юбка, размер: " + this.size + ", цена: " + this.price + ", цвет: " + this.color);
    }
}
