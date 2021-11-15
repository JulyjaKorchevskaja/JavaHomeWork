package com.pb.korchevskaja.hw7;

public class Tie extends Clothes implements ManClothes{

    public Tie(Size size, String price, String color) {
        super(size, price, color);
    }

    public void dressMan(){
        System.out.println("Галстук, размер: " + this.size + ", цена: " + this.price + ", цвет: " + this.color);
    }
}
