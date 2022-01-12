package com.pb.korchevskaja.hw13;
import java.util.*;
import java.io.*;
public class ReadFileAsThread extends Thread{
    private final Queue<Double> dataRead;
    public ReadFileAsThread(Queue<Double> dataRead) {
        this.dataRead = dataRead;
    }
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                System.out.println("Reader: " + readData());
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                break;
            }
        }
    }
    private Double readData() throws InterruptedException {
        synchronized (dataRead) {
            if (dataRead.isEmpty()) {
                dataRead.wait();
            }

            dataRead.notifyAll();
            return dataRead.poll();
        }
    }
}
