import java.net.*;
import java.io.*;

public class Server_03 
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket bank = new ServerSocket(2000);
		System.out.println("Bank is opened:");
		 Socket socket = bank.accept();
		 
		 BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	       PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
	       
	       String Deposit = input.readLine();
	       System.out.println("Deposit money "+Deposit);
	       output.println("Money deposited"+Deposit);
	}
}
