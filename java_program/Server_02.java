//Q2. Moderate : Online food order system.
//Problem --> Customer sends food order to restaurant server.
//Solution --> A)Client sends food item name.
//             B)Server response with confirmation.

import java.net.*;
import java.io.*;
public class Server_02
{
	public static void main(String[] args) throws IOException 
	{	
       ServerSocket server = new ServerSocket(5000);
       System.out.println("Restaurant Server is started:");
       Socket socket = server.accept();

       BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
       PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
       
       
	   String order = input.readLine();
	   System.out.println("Order received :"+ order);
	   output.println("Order confirmed :"+ order);
	   socket.close();
	   server.close();
	}
}
