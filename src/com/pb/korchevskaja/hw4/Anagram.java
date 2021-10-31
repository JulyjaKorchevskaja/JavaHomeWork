package com.pb.korchevskaja.hw4;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String s1 = getLine(scanner);
        String s2 = getLine(scanner);
        s1 = delSpecChar(s1);
        s2 = delSpecChar(s2);
        comparisonLine(s1, s2);
    }
    static String getLine(Scanner scanner){
        return scanner.nextLine();
    }
    static String delSpecChar(String line){
        return line.replaceAll(("[\\.,\\s!;?:\"]+"), "").toLowerCase(Locale.ROOT);
    }
    static void comparisonLine (String line1, String line2){
        int s1ln = line1.length();
        int s2ln = line2.length();
        if(s1ln != s2ln){
            System.out.println("Строки не являются анаграммами");
        }
        char[] arrayLine1 = getSortArray(line1);
        char[] arrayLine2 = getSortArray(line2);
        if(Arrays.equals(arrayLine1,arrayLine2)) {
            System.out.println("Строки являются анаграммами");
        }
    }
    static char[] getSortArray(String line){
        char[] arrayChar = line.toCharArray();
        Arrays.sort(arrayChar);
        return arrayChar;
    }
}
//Аз есмь строка, живу я, мерой остр.
//За семь морей ростка я вижу рост.