package Java2.lesson61;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Java 2. HomeLesson6
 *
 * @author MadMopuse
 * @version 21.09.2022 HomeLesson5
 */

public class ClientApp {

    //клиентская часть
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
        Socket socket = new Socket("localhost", 6666)) {
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                outputStream.writeUTF(scanner.nextLine());
                System.out.println(inputStream.readUTF());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

