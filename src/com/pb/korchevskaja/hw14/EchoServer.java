package com.pb.korchevskaja.hw14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServer {

    static class Handler implements Runnable {
        private final Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + ": Получен запрос от клиента");

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                String headerLine;
                while((headerLine = in.readLine()).length() != 0){
                    System.out.println(headerLine);
                }

                StringBuilder payload = new StringBuilder();
                while(in.ready()){
                    payload.append((char) in.read());
                }
//                String string = (payload.replace(0, 7, "")).toString();
                payload.replace(0, 7, "");

                System.out.println("\nТело запроса: " + payload);
                int sec = 10;
                System.out.println("Ждем " + sec + " секунд имитируя долгу обработку");
//                Thread.sleep(sec * 1000);
                out.write("HTTP/1.0 200 OK\r\n");
                out.write("Content-Type: text/html; charset=utf-8\r\n");
                out.write("\r\n");
                out.write("<html><body>");
                out.write("<h2>Введите сообщение</h2>");
                out.write("<form method = 'POST' action = ''>");
                out.write("<input type='text' name = 'qwerty'>");
                out.write("<input type='submit'/>");
                out.write("</form>");
                if(payload.length() != 0){
                    out.write("<h3>Ответ от сервера, текущая дата: ");
                    out.write(LocalDateTime.now().toString()+"</h3>");
                    out.write("<h3>Отправленное сообщение: " + payload + "</h3>");
                } else {
                    out.write("<h3>Вы ничего не отправляли серверу</h3>");
                }
                out.write("</body></html>");

                System.out.println("Закрываем соединение с клиентом");
                out.close();
                in.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (Exception ex) {

                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int port = 1234;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Сервер запущен на порту : " + port);
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            threadPool.submit(new Handler(clientSocket));
        }
    }
}

