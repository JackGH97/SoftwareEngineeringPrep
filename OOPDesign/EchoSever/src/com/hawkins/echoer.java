package com.hawkins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class echoer extends Thread{
    private Socket socket;

    public echoer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output =  new PrintWriter(socket.getOutputStream(), true);
            while (true) {
                String echoString = input.readLine();
                System.out.println("Received Client");
                if(echoString.equals("exit")){
                    break;
                }
                output.println("Echo from Server " + echoString);
            }
        }catch (IOException e){
            System.out.println("Oops" + e.getMessage());
        } finally {
            try{
                socket.close();
            }catch (IOException e){

            }
        }
    }
}
