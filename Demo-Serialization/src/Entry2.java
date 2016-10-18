import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.cg.Bank;
import com.cg.Teller;

public class Entry2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		DESERIALIZE AN OBJECT FROM A STREAM
		
		
		FileInputStream fIn = new FileInputStream("test.ser");
		
		try(ObjectInputStream in = new ObjectInputStream(fIn)){
			Teller teller1 = (Teller) in.readObject();
			
			System.out.println(teller1.getBank());

			teller1.getBank().setName("XYZ");
			
			Teller teller2 = (Teller) in.readObject();
			
			
			
			
			System.out.println(teller2.getBank().getName());
			
		}
		
		
		
	}
}
