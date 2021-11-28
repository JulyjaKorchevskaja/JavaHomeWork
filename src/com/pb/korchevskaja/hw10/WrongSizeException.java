package com.pb.korchevskaja.hw10;

public class WrongSizeException extends Throwable {
    WrongSizeException() {
        System.out.println("Maximum array size exceeded");
    }
}
