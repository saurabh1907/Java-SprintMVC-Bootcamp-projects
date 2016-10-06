import java.io.IOException;
import java.util.LinkedList;

import com.simulationdemo.Animal;
import com.simulationdemo.Cat;


public class Entry {
	public static void main(String[] args) {
		System.out.println("first");
		try{
			throw new ClassNotFoundException();
		}catch (ClassNotFoundException e){
			System.out.println("cfe");
		}finally{
			try{
				throw new IOException();
				}catch(IOException e1){
					System.out.println("io");
				}
			
		}
		System.out.println("last");
		
}
}
