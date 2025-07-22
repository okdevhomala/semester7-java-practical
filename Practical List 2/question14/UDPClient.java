package question14;

import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();

        String msg = "Hello from Client (Khusboo)";
        InetAddress ip = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), ip, 6000);
        ds.send(dp);

        byte[] buffer = new byte[1024];
        DatagramPacket replyPkt = new DatagramPacket(buffer, buffer.length);
        ds.receive(replyPkt);

        String reply = new String(replyPkt.getData(), 0, replyPkt.getLength());
        System.out.println("UDP Server: " + reply);

        ds.close();
    }
}

