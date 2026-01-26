
// echo back what ever text given by client

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        //try-with-resource
        //automatically close resources - after block , even error
        try (ServerSocket server = new ServerSocket(5000)) {


            System.out.println("Server Started");

            //closes server socket automatically

            //now open a socket to a client
            // socket - for one client - for communication
            //            The method blocks until a connection is made.


            //input and output streams will automatically closed - when socket connection closed
            try (Socket socketOne = server.accept();) {


                // here it comes after a client connects
                System.out.println("Client is connected");


                // for incoming
                BufferedReader reader = new BufferedReader(new InputStreamReader(socketOne.getInputStream()));
                // for out
//            autoFlush – A boolean; if true,
//            the println,
//            printf, or
//            format methods  ----- will flush the output buffer
                PrintWriter output = new PrintWriter(socketOne.getOutputStream(), true);




                //reading messages come from client
                while(true){
                    String string = reader.readLine();
                    System.out.println("From Client:"+string);
                    if(string.equals("Exit")){
                        break;
                    }
                    //after break it is not coming here
                    output.println("From server(Echo):"+string);
                }






            }


        } catch (IOException e) {
            //closes server socket automatically
            // print the error
            System.out.println("Exception " + e.getMessage());
        }


    }
}
