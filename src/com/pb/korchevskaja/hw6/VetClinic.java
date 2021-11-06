package com.pb.korchevskaja.hw6;
import com.pb.korchevskaja.hw6.Veterinarian;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class VetClinic {
    public static void main(String[] args) throws Exception{

        Animal [] animals = new Animal[]{new Dog("Победа", "Сосиски"), new Cat("Тополь", "Сметана"), new Horse("Покровский", "Сено")};


        Class clazz = Class.forName("com.pb.korchevskaja.hw6.Veterinarian");
        Constructor constr = clazz.getConstructor(new Class[] {});
        Object obj = constr.newInstance();
        if(obj instanceof Veterinarian) {
            for (int i = 0; i < 3; i++) {
                ((Veterinarian) obj).treatAnimal(animals[i]);
            }
        }
    }
}
