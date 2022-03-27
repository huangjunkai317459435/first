package net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws SocketException {

        byte buff[]= new byte[1024];
        DatagramPacket dp = new DatagramPacket(buff, buff.length);
        DatagramSocket ds = new DatagramSocket(1234);


    }
}
