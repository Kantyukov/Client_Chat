package ru.artem.kantukov.programm;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MainProgram {
    public static final int PORT =  8081;
    public static final String HOST = "";

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(HOST, PORT);
        if (socket.isConnected()){
            PrintWriter serverWriter = new PrintWriter(socket.getOutputStream());
            serverWriter.println("Hi from client!");
            serverWriter.flush();
        }

    }
}
