import java.io.*;
import java.net.*;
class ClientHandling extends Thread
{ 
	Socket socket;
	static int balance = 10000;
	ClientHandling(Socket socket)
	{
		this.socket = socket;
	}
	public void run() 
	{ try
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(socket.getInputStream()));
		PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
		int deposit = Integer.parseInt(input.readLine());
		
		synchronized (ClientHandling.class)
		{
			balance = balance + deposit;
			output.println("Deposit successful.Updated balance :"+balance);
		}
		socket.close();
	}
		catch(Exception e)
	{
			e.printStackTrace();
	}
	}
}
public class Server_04                                        
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket server = new ServerSocket(5000);
		System.out.println("Bank server is started:");
		
		while(true)
		{
			Socket socket = server.accept();
			new ClientHandling(socket).start();
			
			}
		
	}

}
