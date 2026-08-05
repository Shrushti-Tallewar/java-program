import java.net.*;
import java.io.*;
public class Clients_04 
{
	public static void main(String[] args) throws UnknownHostException, IOException 
	{	
       Socket socket = new Socket("LocalHost",5000);
       
       BufferedReader input = new BufferedReader (new InputStreamReader(socket.getInputStream()));
		PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
		
		output.println("5000");
       String response = input.readLine();
       System.out.println(response);
       socket.close();
	}
}
