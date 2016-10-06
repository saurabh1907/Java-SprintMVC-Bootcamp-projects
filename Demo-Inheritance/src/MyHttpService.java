import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyHttpService {
public static void main(String[] args) throws IOException {
	int port = 999;
	
	ServerSocket service = new ServerSocket(port);
	System.out.println("waiting");
	Socket clientInfo = service.accept();
	System.out.println(clientInfo);
	InputStreamReader inp=new InputStreamReader(clientInfo.getInputStream());
	BufferedReader bufferReader = new BufferedReader(inp);
	PrintWriter  out= new PrintWriter(clientInfo.getOutputStream());
	while(true){
		String abc= bufferReader.readLine();
		if(abc.isEmpty()){
			break;
		}
		//System.out.println("abc");
		System.out.println(abc);
		
		out.println("<p> Hello world </p>");
		
		
	}
	
	

	out.close();
    


   

    clientInfo.close();
    service.close();
}
}
