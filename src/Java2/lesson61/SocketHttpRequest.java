package Java2.lesson61;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketHttpRequest {
    //Demonstraciya HTTP zaproca (урезанная, bez header)

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("www.nye.edu", 80);

        InputStream responce = socket.getInputStream();
        OutputStream request = socket.getOutputStream();

        byte[] bytes = ("GET /community.html HTTP/1.0\n" + "Host: www.nye.edu\n\n").getBytes();

        request.write(bytes);

        int ch;
        while ((ch = responce.read()) != -1) {
            System.out.println((char) ch);
        }

        socket.close();
    }
}
