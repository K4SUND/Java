package MultiClientWithThreads;
// echo back what ever text given by client

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static void main(String[] args) {

        // threads
        ExecutorService executorService = Executors.newCachedThreadPool();
        try(
                ServerSocket server = new ServerSocket(5000)
                )
        {
            while(true)
            {
                Socket socket = server.accept();
                System.out.println("Client is connected");

                //
                executorService.submit(()->handleClientRequest(socket));
            }

        }catch (Exception e)
        {

            System.out.println("Server Exception "+e.getMessage());

        }


    }

    private static void handleClientRequest(Socket socket)
    {

        // try with resources
        try(
                socket;
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
                )
        {
            // body
            while (true) {

                // here it blocks until client give a message
                String string = reader.readLine();
                System.out.println("From Client:" + string);
                if (string.equals("Exit")) {
                    break;
                }
                //after break it is not coming here
                output.println("From server(Echo):" + string);
            }

        }catch (Exception e)
        {
            System.out.println("Client socket shutdown");
        }

    }
}
