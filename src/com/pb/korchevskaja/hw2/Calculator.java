
package com.pb.korchevskaja.hw2;
import java.util.Scanner;

public class Calculator {
public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    int operand1 = scan.nextInt();
    int operand2 = scan.nextInt();
    String sign = scan.next();
    if (operand2 ==0 && sign.equals("/")){
        System.out.println ("На ноль делить нельзя");
    } else {
        switch (sign) {
            case "+":
                System.out.println (operand1 + operand2);
                break;
            case "-":
                System.out.println (operand1 - operand2);
                break;
            case "*":
                System.out.println (operand1 * operand2);
                 break;
            case "/":
                System.out.println (operand1 / operand2);
                break;
            default:
                System.out.println ("Данные не верные");


        }
    }
}
}


