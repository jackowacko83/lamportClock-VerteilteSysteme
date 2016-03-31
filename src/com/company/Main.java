package com.company;

import org.apache.commons.lang3.RandomStringUtils;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ClientMessenger client1 = new ClientMessenger();
        ClientMessenger client2 = new ClientMessenger();

//        client1.sendMessage(client2, "hehe Penis!");
//
//        client2.sendMessage(client1, "laksjdfalsdjf");
//
//        client2.sendMessage(client1, "alsd;fjads;fj");

        while (true){
            Thread.sleep((int)(Math.random()*5000));
            String message = RandomStringUtils.random((int)(Math.random()*5000));
            if(Math.random()>0.5){

                client1.sendMessage(client2, message);
            }
            else {
                client2.sendMessage(client1, message);
            }

        }



    }
}
