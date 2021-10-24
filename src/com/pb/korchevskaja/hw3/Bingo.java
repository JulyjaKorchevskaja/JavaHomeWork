package com.pb.korchevskaja.hw3;
import java.util.Random;
import java.util.Scanner;
public class Bingo {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        Random julia = new Random();
        int continueGame = 0;
        for (int counter = 1; counter == 1||continueGame ==1; counter++) {
            int x = julia.nextInt(101);
            System.out.println("Введите число от 0 до 100");
            int y = scanner.nextInt();
            if (x==y) {
                System.out.println("Число отгадано. Количество попыток:" + counter);
            }else {
                if (x<y) {
                    System.out.println("Задуманное число меньше вводимого");
                }
                if (x>y) {
                    System.out.println("Задуманное число больше вводимого");
                }
            }
            System.out.println("Желаете продолжить игру? Да - нажмите 1; Нет - нажмите 2.");
            continueGame = scanner.nextInt();
        }



    }
}
