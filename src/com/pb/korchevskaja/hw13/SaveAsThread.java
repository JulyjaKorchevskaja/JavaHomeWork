package com.pb.korchevskaja.hw13;
import java.util.*;
import java.io.*;
public class SaveAsThread implements Runnable{
    private int[] numbers;
    private String filename;
    private String threadName;
    private Thread thread;

    public SaveAsThread(int[] numbers, String filename, String threadName) {

        this.numbers = numbers;

        this.filename = filename;

        this.threadName = threadName;

        thread = new Thread(this, "SaveThread");
    }

    public void start() {
        thread.start();
    }

    public void run() {
        System.out.println("Begin thread: " + threadName);

        try {
            FileOutputStream fOut = new FileOutputStream(filename);

            PrintStream pS = new PrintStream(fOut);

            pS.println(numbers.length);
            for (int i=0; i<numbers.length; i++) {
                pS.println(numbers[i]);
            }

            pS.close();
            fOut.close();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("End thread: " + threadName);
    }
}
