import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class RequestProcessingJob implements Runnable {
	private Socket sock;

	public RequestProcessingJob(Socket sock) {
		this.sock = sock;
	}

	@Override
	public void run() {

		new Thread(
				new Runnable(){
					
					public void run() {
						try {
							InputStream in = sock.getInputStream();
							
							InputStreamReader bridge = new InputStreamReader(in);
							BufferedReader br = new BufferedReader(bridge);
							String line = br.readLine();
							while(line!=null){
								
								System.out.println(line);
							}
							
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					};
				}
				
				
		).start();
		
		
		new Thread(
				
				new Runnable() {
					
					@Override
					public void run() {
						OutputStream out;
						try {
							out = sock.getOutputStream();
							PrintWriter pw = new PrintWriter(out);
							
							BufferedReader scn = new BufferedReader(new InputStreamReader(System.in));
							Thread.sleep(100);
							String msg;
							while((msg= scn.readLine())!= null){
						
								pw.println(msg);
								pw.flush();
							}
							
							
						} catch (IOException e) {
							e.printStackTrace();
						}
						catch (InterruptedException e) {
						}
						
					}
				}
				
				
				
				
		).start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
