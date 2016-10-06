import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyChatService {

	public static void main(String[] args) throws IOException {
		
		
		ServerSocket service = new ServerSocket(5511);
		
		while(true){
//			IMPLICITLY RETRIEVING A SOCKET
			Socket clientSocket = service.accept();
			
			new Thread(new RequestProcessingJob(clientSocket)).start();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
