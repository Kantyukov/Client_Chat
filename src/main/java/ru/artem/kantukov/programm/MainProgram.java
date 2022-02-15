package ru.artem.kantukov.programm;

import ru.artem.kantukov.programm.services.ClientService;
import ru.artem.kantukov.programm.services.ClientServiceImpl;

import java.io.IOException;

public class MainProgram {


    public static void main(String[] args) throws IOException {
        ClientService clientService = new ClientServiceImpl();
        clientService.start();


    }
}
