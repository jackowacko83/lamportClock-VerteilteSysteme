package com.company;

/**
 * Created by Jacob on 31.03.16.
 */
public class ClientMessenger {
    int clock;

    public ClientMessenger() {
        this.clock = 0;
    }

    public void sendMessage(ClientMessenger c, String message){
        c.receive(message, clock);
    }

    public void receive(String message, int outerClock){
        System.out.println("Clock: "+ clock + "   " + message);

        this.clock = Math.max(outerClock, clock)+1;

        System.out.println("Clock: "+ clock + "   " + message);

    }
}
