package com.pb.korchevskaja.hw8;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message){
        System.out.println(message);
    }
}
