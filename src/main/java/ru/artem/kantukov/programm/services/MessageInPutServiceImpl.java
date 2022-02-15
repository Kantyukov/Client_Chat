package ru.artem.kantukov.programm.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MessageInPutServiceImpl implements MessageInPutService{
    private final BufferedReader bufferedReader;

    public MessageInPutServiceImpl(InputStream inputStream) {
       bufferedReader = new BufferedReader(new InputStreamReader(inputStream)) ;


    }


    @Override
    public String getMessage() throws IOException {
        return bufferedReader.readLine();
    }
}
