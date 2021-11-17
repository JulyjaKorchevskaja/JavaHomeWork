package com.pb.korchevskaja.hw8;

public class WrongLoginException extends Exception {
    WrongLoginException(String message) {
        System.out.println(message);
    }
}
