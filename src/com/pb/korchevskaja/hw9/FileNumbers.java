package com.pb.korchevskaja.hw9;

import com.pb.korchevskaja.hw3.Array;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class FileNumbers {
    public static String getNumbersLine(Random rand){
        String numsLine = "";
        for(int i =0; i<10; i++) {
            int num = rand.nextInt(99) + 1;
            if(i == 0){
                numsLine += num;
            }else{
                numsLine += ", " + num;
            }
        }
        return numsLine;
    }
    public static void createNumbersFile(String fileName, int countLine){
        Random rand = new Random();
        try (Writer writer = new FileWriter("src\\com\\pb\\korchevskaja\\hw9\\" + fileName + ".txt")) {
            for(int i =1; i<=countLine; i++) {
                writer.write(getNumbersLine(rand) + "\n");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static void createOddNumbersFile(String fileNameRead, String fileNameCreate){
        String allOddNumLines = "";
        try {
            File file = new File("src\\com\\pb\\korchevskaja\\hw9\\" + fileNameRead + ".txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                int numArr[] = Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray();
                String oddNumsLine = "";
                for(int i =0; i<numArr.length; i++){
                    if(numArr[i]%2 == 0){
                        numArr[i]=0;
                    }
                    if(i == 0){
                        oddNumsLine += numArr[i];
                    }else if(i == numArr.length-1){
                        oddNumsLine += ", " + numArr[i] + "\n";
                    }else{
                        oddNumsLine += ", " + numArr[i];
                    }

                }
            allOddNumLines += oddNumsLine;
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Writer writer = new FileWriter("src\\com\\pb\\korchevskaja\\hw9\\" + fileNameCreate + ".txt")) {
            writer.write(allOddNumLines);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static void main(String [] args){
        createNumbersFile("Numbers", 10);
        createOddNumbersFile("Numbers", "odd-numbers");
    }
}
