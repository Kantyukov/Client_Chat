package ru.artem.kantukov.programm.services;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientServiceImpl implements ClientService {
    public static final int PORT =  8081;
    public static final String HOST = "";
    @Override
    public void start() throws IOException {
        Socket socket = new Socket(HOST, PORT);
        if (socket.isConnected()){
            Thread thread = new Thread(new SocketRunnable(socket));
            thread.start();
            System.out.println("Введите сообщение в консоль");
            PrintWriter serverWriter = new PrintWriter(socket.getOutputStream());

            MessageInPutService messageInPutService = new MessageInPutServiceImpl(System.in);
            String messageFromConsole = messageInPutService.getMessage();

            serverWriter.println(messageFromConsole);
            serverWriter.flush();
        }
    }
}
