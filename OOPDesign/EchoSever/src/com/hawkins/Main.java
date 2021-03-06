package com.hawkins;

import java.io.*;
import java.net.ServerSocket;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            while (true) {
                new echoer(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            System.out.println("sever exception " + e.getMessage());
        }
    }
}
