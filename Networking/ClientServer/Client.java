import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {


    public static void main(String[] args) {


        System.out.println("Client started");

        // socket to connect with server
        // communicate
        try (Socket client = new Socket("localhost", 5000)) {

            System.out.println("Connected to Server");
            PrintWriter send = new PrintWriter(client.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            Scanner in = new Scanner(System.in);

            String sendMessage;
            String inputMessage;

            do {

                System.out.println("Enter String:");
                sendMessage = in.nextLine();

                //connect to server
                // output
                send.println(sendMessage);

                //input
                if(!sendMessage.equals("Exit")){
                    inputMessage = reader.readLine();  // it returns null if not there
                    System.out.println(inputMessage);
                }


            } while (!sendMessage.equals("Exit"));
            System.out.println("Client closed the connection");


        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            System.out.println("Client is disconnected");
        }
    }
}
