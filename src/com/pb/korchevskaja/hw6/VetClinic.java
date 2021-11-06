package com.pb.korchevskaja.hw6;
import com.pb.korchevskaja.hw6.Veterinarian;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class VetClinic {
    public static void main(String[] args){

        Animal [] animals = new Animal[]{new Dog("Победа", "Сосиски"), new Cat("Тополь", "Сметана"), new Horse("Покровский", "Сено")};
        Veterinarian veterinarian = new Veterinarian();
        for(int i = 0; i<3; i++){
            veterinarian.treatAnimal(animals[i]);
        }


        Class clazz = veterinarian.getClass();
        clazz.treatAnimal(animals[0]);
    }
}
