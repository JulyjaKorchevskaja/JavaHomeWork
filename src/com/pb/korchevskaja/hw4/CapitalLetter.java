package com.pb.korchevskaja.hw4;

import java.util.Scanner;

public class CapitalLetter {
    static String  upperChar(String line1, String line2){
        line2 += line1.substring(0, 1).toUpperCase();
        for (int i = 1; i < line1.length(); i++) {
            if (" ".equals(line1.substring(i-1, i)))
                line2 += line1.substring(i, i+1).toUpperCase();
            else
                line2 += line1.substring(i, i+1);
        }
        return line2;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s1 = scanner.nextLine(), s2 = "";
        String result = upperChar(s1, s2);
        System.out.println(result);
    }
}
//Истина — это то, что выдерживает проверку опытом. Эйнштейн А.

