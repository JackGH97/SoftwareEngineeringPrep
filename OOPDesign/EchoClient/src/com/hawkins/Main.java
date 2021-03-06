package com.hawkins;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try(Socket socket = new Socket("localhost", 5000)){
            BufferedReader echoes = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(),true);

            Scanner scanner = new Scanner(System.in);
            String echoString;
            String response;
            // use do while loop as we don't know how many times this will execute.
            do{
                System.out.println("Enter string to be echoed");
                echoString = scanner.nextLine();
                stringToEcho.println(echoString);
                if(!echoString.equals("exit")){
                    response = echoes.readLine();
                    System.out.println(response);
                }
            } while (!echoString.equals("exit"));
        }catch (IOException e){
            System.out.println("Client Error " + e.getMessage());
        }
    }
}
