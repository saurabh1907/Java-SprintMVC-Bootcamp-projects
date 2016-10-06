import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IOStreams {
	public static void main(String[] args){
		String input;
		String outputFile = "output.txt";
		 InputStreamReader is= new InputStreamReader(System.in);
		 BufferedReader bufferReader = new BufferedReader(is);
		 
		 try{
			PrintWriter out =new PrintWriter(outputFile);
			input= bufferReader.readLine();
			
			for(int i=0;i< input.length();i++){
				 Character c= input.charAt(i);
				 if(Character.isUpperCase(c)){
					 c = Character.toLowerCase(c);
				 }
				 else if(Character.isLowerCase(c)){
					 c= Character.toUpperCase(c);
				 }
				 
				 out.write(c); 
				 out.flush();
				 
			 }
			//out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
	}
//			finally{
//			out.close();
//		}
		
	}
}
