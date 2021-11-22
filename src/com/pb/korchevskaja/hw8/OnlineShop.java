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
        int userReg = user.signUp(loginUp, passwordUp, confirmPassword);
        try {
            if (userReg == 1)
                throw new WrongLoginException("Login is not right");
        } catch (WrongLoginException e) {
            e.printStackTrace();
        }
        try {
            if (userReg == 2)
                throw new WrongPasswordException("Password is not right");
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
        System.out.println("Войдите:");
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        int signUser = user.signIn(login, password);
        try {
            if (signUser == 1)
                throw new WrongLoginException("Login is not right");
        } catch (WrongLoginException e) {
            e.printStackTrace();
        }
        try {
            if (signUser == 2)
                throw new WrongPasswordException("Password is not right");
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}