import java.net.*;
import java.io.*;

public class Client_03 {

	public static void main(String[] args) throws UnknownHostException, IOException 
	{	
        Socket socket = new Socket ("LocalHost",2000);
		
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
		
		output.println(3000);
		
		String response = input.readLine();
		System.out.println(response);
	}

}
