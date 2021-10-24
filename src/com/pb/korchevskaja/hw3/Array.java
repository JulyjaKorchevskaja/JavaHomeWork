package com.pb.korchevskaja.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allnumers = "";
        int positiveNumbers =0;
        int countArray = 10;
        int[] array = new int[countArray];
        System.out.println("Введите 10 цифр");
        for (int counter = 0; counter < countArray; counter++) {
            array[counter] = scanner.nextInt();
            allnumers += array[counter] + ",";
            if (array[counter] > 0) {
                positiveNumbers ++;
            }
        }
        int sum = Arrays.stream(array).sum();
        String allNumsSort = "";
        for (int i = countArray-1; i >=1; i--) {
            for (int counter = 0; counter < i; counter++) {
                int j = counter;
                if (array[i] > array[j]) {
                    int num = array[i];
                    array[i] = array[j];
                    array[j] = num;
                }
            }
            allNumsSort += array[i] + ", ";
        }
        allNumsSort += array[0] + ", ";
        System.out.println("Введенный массив чисел: " + allnumers + ". Сумма всех элементов массива: " + sum + ". Количество положительных чисел массива: " + positiveNumbers + ". Отсортированный массив: " + allNumsSort);
    }
}