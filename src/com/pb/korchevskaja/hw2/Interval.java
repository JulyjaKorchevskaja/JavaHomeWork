package com.pb.korchevskaja.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number >= 0 && number <= 14) {
            System.out.println("Число в промежутке [0-14]");
        }
        if (number >= 15 && number <= 35) {
            System.out.println("Число в промежутке [15-35]");
        }
        if (number >= 36 && number <= 50) {
            System.out.println("Число в промежутке [36-50]");
        }
        if (number >= 51 && number <= 100) {
            System.out.println("Число в промежутке [51-100]");
        }
        if (number > 100 || number < 0) {
            System.out.println("Число не попадает в один из имеющихся промежутков");
        }
    }
}