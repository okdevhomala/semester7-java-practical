package question14;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        String msg = in.readLine();
        System.out.println("Client: " + msg);
        out.println("Hello from Server (Khusboo Karki)");

        s.close();
        ss.close();
    }
}
