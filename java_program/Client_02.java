import java.net.*;
import java.io.*;

public class Client_02
{

	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		Socket socket = new Socket("LocalHost",5000);
		
		BufferedReader input = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));//pass input 
		
		PrintWriter output = new PrintWriter(socket.getOutputStream(), true);//pass output
		
		output.println("Ice cream");
		
		String response = input.readLine();
		System.out.println(response);
		
		socket.close();
	}

}
