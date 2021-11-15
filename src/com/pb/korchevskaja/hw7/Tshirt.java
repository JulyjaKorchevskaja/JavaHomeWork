package com.pb.korchevskaja.hw7;

public class Tshirt extends Clothes implements ManClothes, WomanClothes {

    public Tshirt(Size size, String price, String color) {
        super(size, price, color);
    }

    public void dressMan(){
        System.out.println("Рубашка мужская, размер: " + this.size + ", цена: " + this.price + ", цвет: " + this.color);
    }
    public void dressWoman(){
        System.out.println("Рубашка женская, размер: " + this.size + ", цена: " + this.price + ", цвет: " + this.color);
    }
}
