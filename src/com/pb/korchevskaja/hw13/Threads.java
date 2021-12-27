package com.pb.korchevskaja.hw13;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Threads {
    public static void main(String[] args) throws IOException {

        int[] numbers = new int[5];
        while(true) {
            for (int i = 0; i < 5; i++) {
                numbers[i] = (int) (Math.random() * 100);
            }

            SaveAsThread write = new SaveAsThread(numbers, "numbers.txt", "write");

            write.start();

            ReadFileAsThread read = new ReadFileAsThread("numbers.txt", "read");

            read.start();

            try {
                read.join();
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }

            int[] numbersFromFile = read.get();

            System.out.print("numbers from file = [ ");
            for (int d : numbersFromFile)
                System.out.print(d + " ");
            System.out.println(" ]");
        }
    }
}
