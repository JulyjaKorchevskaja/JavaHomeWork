package com.pb.korchevskaja.hw15;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.*;

public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame();
        Label label = new Label("Employee id:");
        Button button = new Button("Submit");
        TextField textField = new TextField();

        label.setBounds(20, 70, 80, 30);
        textField.setBounds(20, 100, 80, 30);
        button.setBounds(100, 100, 80, 30);

        frame.add(button);
        frame.add(label);
        frame.add(textField);

        frame.setSize(400,300);
        frame.setTitle("Employee info");

        // нужно убрать менеджер компоновки который установлен по умолчанию
        // иначе будет использован BorderLayout и компоненты будут расположены не так как задумано
        frame.setLayout(null);

        // для работы кнопки закрытие окна "крестик"
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        Main mes = new Main();
        // обработка нажатия кнопки
        button.addActionListener(event -> mes.excutePost("http://127.0.0.1", textField.getText()));

        frame.setVisible(true);
    }

    public boolean excutePost(String targetURL, String urlParameters)
    {
//        URL url;
        HttpURLConnection connection = null;
        System.out.println(urlParameters);
        try {
            URL url = new URL(
                    "http",
                    "127.0.0.1",
                    1234,
                    "/");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setRequestProperty("Method", "POST");
            urlConnection.setRequestProperty("Content-type", "text/html");
            urlConnection.setDoOutput(true);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(urlConnection.getOutputStream()));
            out.write("123");
            out.close ();
//            out.flush();
            String headerLine;
//            while((headerLine = in.readLine()).length() != 0){
//                System.out.println(headerLine + "цикл");
//            }
            StringBuilder payload = new StringBuilder();
            System.out.println(payload);

//            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//            while(in.ready()){
//                payload.append((char) in.read());
//            }
//            WritableByteChannel rbc = Channels.newChannel(urlConnection.getOutputStream());
//            rbc.write("123")
//            DataOutputStream wr = new DataOutputStream (urlConnection.getOutputStream());
//            wr.writeUTF(urlParameters);
//            wr.flush ();
//            wr.close ();
//            InputStream is = urlConnection.getInputStream();//тут фигня
//            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
//            String line;
//            StringBuffer response = new StringBuffer();
////            while((line = rd.readLine()) != null) {
////                response.append(line);
////                response.append('\r');
////            }
//            rd.close();
//            connection = (HttpURLConnection)url.openConnection();
//            connection.setRequestMethod("POST");
//            connection.setRequestProperty("Content-Type", "text/html");
//            connection.setRequestProperty("custom-Header", "XYZ");
//
//            connection.setRequestProperty("Content-Length", "" +
//                    Integer.toString(urlParameters.getBytes().length));
//            connection.setRequestProperty("Content-Language", "ru-RU");

//            connection.setUseCaches (false);
//            connection.setDoInput(true);
//            connection.setDoOutput(true);

            //Send request
//            DataOutputStream wr = new DataOutputStream (connection.getOutputStream());
//            wr.writeUTF(urlParameters);
//            wr.flush ();
//            wr.close ();
//            InputStream is = connection.getInputStream();
//            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
//            String line;
//            StringBuffer response = new StringBuffer();
//            while((line = rd.readLine()) != null) {
//                response.append(line);
//                response.append('\r');
//            }
//            rd.close();
            System.out.println(payload + "/  123");
            return true;

        } catch (Exception e) {

            System.out.println(321);
            e.printStackTrace();
            return false;

        } finally {

            if(connection != null) {
                connection.disconnect();
            }
        }
    }

}
