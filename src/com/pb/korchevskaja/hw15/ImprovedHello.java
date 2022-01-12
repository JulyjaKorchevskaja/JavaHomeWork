package com.pb.korchevskaja.hw15;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImprovedHello extends Application {
    private static String messageUser;

    private static String getMessageUser() {
        return messageUser;
    }

    static class Handler implements Runnable {
        private final Socket socket;

        public String message;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
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

                payload.replace(0, 7, "");
                ImprovedHello.messageUser = payload.toString();
                this.message = ImprovedHello.getMessageUser();

                if(this.message.length() != 0){
                    ImprovedHello.messageUser = LocalDateTime.now().toString() + this.message;
                } else {
                    ImprovedHello.messageUser = "Вы ничего не отправляли серверу";
                }
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

    public static void main(String[] args) {
        int port = 1234;
//        ServerSocket serverSocket = new ServerSocket(port);
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        while (true) {
//            Socket clientSocket = serverSocket.accept();
//            threadPool.submit(new EchoServer.Handler(clientSocket));
        }
//        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Label nameLbl = new Label("Enter your name:");
        TextField nameFld = new TextField();
        Label msg = new Label();

        // задается css для надписи
        msg.setStyle("-fx-text-fill: blue;");
        Button sayHelloBtn = new Button("Say Hello");
        Button exitBtn = new Button("Exit");

        sayHelloBtn.setOnAction(e -> {
            this.messageUser = nameFld.getText();
        });

        exitBtn.setOnAction(e -> Platform.exit());
        VBox root = new VBox();
        root.setSpacing(5);
        root.getChildren().addAll(nameLbl, nameFld, msg, sayHelloBtn, exitBtn);
        Scene scene = new Scene(root, 350, 150);
        stage.setScene(scene);
        stage.setTitle("Improved Hello JavaFX Application");
        stage.show();

    }
}
