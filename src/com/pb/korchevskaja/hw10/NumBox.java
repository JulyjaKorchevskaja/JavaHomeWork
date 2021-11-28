package com.pb.korchevskaja.hw10;

public class NumBox<T extends Number> {
    private T[] numbers;

    public NumBox(int lengthMax) {
        numbers = (T[]) new Number[lengthMax];
    }

    public void add(T number) {
        int i = this.length();
        try {
            if (i > this.numbers.length) {
                throw new WrongSizeException();
            }
            this.numbers[i] = number;
        } catch (WrongSizeException e) {
            e.printStackTrace();
        }
    }

    public T get(int i) {
        return this.numbers[i];
    }

    public int length() {
        int i = 0;
        for (i = 0; this.numbers[i] != null && i < this.numbers.length; i++) {
        }
        return i;
    }
    public double average(){
        int count = this.length();
        return this.sum()/count;
    }
    public double sum(){
        double sum = this.numbers[0].doubleValue();
        for(int i = 1; this.numbers[i] != null && i < this.numbers.length; i++){
            sum += this.numbers[i].doubleValue();
        }
        return sum;
    }
    public T max(){
        T max = this.numbers[0];
        for(int i =1; this.numbers[i] != null && i < this.length()-1; i++)
            if (max.doubleValue() <= this.numbers[(i)].doubleValue()){
                max = this.numbers[i];
            }
        return max;
    }
}
