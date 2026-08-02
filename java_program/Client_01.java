import java.net.*;
import java.io.*;
public class Client_01 
{
	public static void main(String[] args) throws UnknownHostException, IOException
	{	
       Socket socket = new Socket("LocalHost",2807);
       PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
       out.println("Hello Support Team");
       socket.close();
	}
}
