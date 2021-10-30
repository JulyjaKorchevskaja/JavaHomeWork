package com.pb.korchevskaja.hw4;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();;
        s1 = s1.replaceAll(("[\\.,\\s!;?:\"]+"), "").toLowerCase(Locale.ROOT);
        s2 = s2.replaceAll(("[\\.,\\s!;?:\"]+"), "").toLowerCase(Locale.ROOT);
        int s1ln = s1.length();
        int s2ln = s2.length();
        if(s1ln != s2ln){
            System.out.println("Строки не являются анаграммами");
        }
        char[] s1array = s1.toCharArray();
        char[] s2array = s2.toCharArray();
        Arrays.sort(s1array);
        Arrays.sort(s2array);
        if(Arrays.equals(s1array,s2array)){
            System.out.println("Строки являются анаграммами");
        }
    }
}

//Аз есмь строка, живу я, мерой остр.
//За семь морей ростка я вижу рост.