package com.pb.korchevskaja.hw7;

public class Atelier {
    public static void main(String []args){
        Clothes [] clothes = new Clothes[]{
                new Tie(Size.XXS, "300грн", "Красный"),
                new Pants(Size.XS, "700грн", "Белый"),
                new Skirt(Size.S, "1500грн", "Черный"),
                new Tshirt(Size.M, "2020грн", "Розовый")
                };
        dressMan(clothes);
        dressMWoman(clothes);

    }
    static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof ManClothes) {
                ((ManClothes) clothes[i]).dressMan();
            }
        }
    }
    

    static void dressMWoman(Clothes[] clothes){
        System.out.println("Женская одежда:");
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof WomanClothes) {
                ((WomanClothes) clothes[i]).dressWoman();
            }
        }
    }
}
