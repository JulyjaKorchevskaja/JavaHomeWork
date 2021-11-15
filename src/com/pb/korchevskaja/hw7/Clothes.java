package com.pb.korchevskaja.hw7;

public abstract class Clothes {
    public Size size;
    public String price;
    public String color;
    public Clothes(Size size, String price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
