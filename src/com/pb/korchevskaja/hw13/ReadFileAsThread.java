package com.pb.korchevskaja.hw13;
import java.util.*;
import java.io.*;
public class ReadFileAsThread extends Thread{
    private int[] numbers;
    private String filename;
    private Thread thread;
    public ReadFileAsThread(String filename, String threadName) {
        this.filename = filename;
        thread = new Thread(this, threadName);
    }
    public void Start() {
        thread.start();
    }
    public void run() {
        System.out.println("Begin thread: " + thread.getName());
        FileInputStream fInput;
        try {
            fInput = new FileInputStream(filename);
            Scanner scanner = new Scanner(fInput);
            int count;
            count = scanner.nextInt();
            numbers = new int[count];
            for (int i=0; i<numbers.length; i++)
                numbers[i] = scanner.nextInt();
            scanner.close();
            fInput.close();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("End thread: " + thread.getName());
    }
    public int[] get() { return numbers; }
}
