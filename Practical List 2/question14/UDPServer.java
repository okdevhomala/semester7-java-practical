package question14;

import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(6000);
        byte[] buffer = new byte[1024];

        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        ds.receive(dp);

        String msg = new String(dp.getData(), 0, dp.getLength());
        System.out.println("UDP Client: " + msg);

        String reply = "Hello from Server (Khusboo)";
        InetAddress ip = dp.getAddress();
        int port = dp.getPort();
        DatagramPacket sendPkt = new DatagramPacket(reply.getBytes(), reply.length(), ip, port);
        ds.send(sendPkt);

        ds.close();
    }
}

