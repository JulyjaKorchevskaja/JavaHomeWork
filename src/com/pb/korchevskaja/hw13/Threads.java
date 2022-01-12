package com.pb.korchevskaja.hw13;
import java.util.LinkedList;

public class Threads {
    public static void main(String[] args) throws Exception {

        LinkedList<Double> data = new LinkedList<>();
        int size = 4;
        Thread saveAsTheard = new Thread(new SaveAsThread(data, size), "SaveAsThread");
        Thread readFileAsThread = new Thread(new ReadFileAsThread(data), "ReadFileAsThread");
        saveAsTheard.start();
        readFileAsThread.start();

        Thread.sleep(100);

        saveAsTheard.interrupt();
        readFileAsThread.interrupt();
    }
}
