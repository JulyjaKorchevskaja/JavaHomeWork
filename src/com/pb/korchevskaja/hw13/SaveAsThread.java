package com.pb.korchevskaja.hw13;
import java.util.*;
import java.io.*;
public class SaveAsThread implements Runnable{
    private final Queue<Double> dataSave;
    private final int size;

    public SaveAsThread(Queue<Double> dataSave, int size) {

        this.dataSave = dataSave;

        this.size = size;

    }
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                System.out.println("Creator: " + createData());
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    private double createData() throws InterruptedException {
        synchronized (dataSave) {
            if (dataSave.size() >= size) {
                dataSave.wait();
            }

            double newValue = Math.random();
            dataSave.add(newValue);

            dataSave.notifyAll();

            return newValue;
        }
    }

}
