import java.io.*;
import java.net.*;

public class SocketClient {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Need 2 arguments");
            return;
        }

        String host = args[0];
        int port = Integer.valueOf(args[1]);

        try (
            Socket sock = new Socket(host, port);
            OutputStream out = sock.getOutputStream();
            InputStream in = sock.getInputStream()) {

            int readChar = 0;
            while((readChar = in.read()) != -1) {
                System.out.write(readChar);
            }
            sock.close();

            }

            
        
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
