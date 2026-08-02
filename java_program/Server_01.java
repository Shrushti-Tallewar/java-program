//Socket Programming
//Socket is communication end point
//A socket acts like a telephone communication between client and server.
//Client --> Socket -->Server
//Q1. Basic --> Chat message sender (Client --> Server)
//Problem -- A customer sends a message to customer support.
//Solution --> A) A server that waits for a client message
            // B)Client that sends : "Hello support team."

import java.net.*;
import java.io.*;
public class Server_01 
{
	public static void main(String[] args) throws IOException 
	{
       ServerSocket server = new ServerSocket(2807);
       System.out.println("Server waiting for client");
       Socket socket = server.accept();
 
       BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
       
       String message = in.readLine();
       System.out.println("Client says:"+ message);
       socket.close();
       server.close();
	}
}
