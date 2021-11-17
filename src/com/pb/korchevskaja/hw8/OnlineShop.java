package com.pb.korchevskaja.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Auth user = new Auth();
        System.out.println("Зарегистрируйтесь:");
        String loginUp = scanner.nextLine();
        String passwordUp = scanner.nextLine();
        String confirmPassword  = scanner.nextLine();
        user.signUp(loginUp, passwordUp, confirmPassword);
        System.out.println("Войдите:");
        String loginIn = scanner.nextLine();
        String passwordIn = scanner.nextLine();
        user.signIn(loginIn, passwordIn);
    }
}