import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.cg.Bank;
import com.cg.Teller;

public class Entry {
	public static void main(String[] args) throws IOException {
		
//		SERIALIZING AN OBJECT INTO A STREAM
		
		FileOutputStream fOut = new FileOutputStream("test.ser");
		
		try(ObjectOutputStream out = new ObjectOutputStream(fOut)){
			Bank bankRef = new Bank();
			
			Teller teller1 = new Teller(bankRef);
			
			
			Teller teller2 = new Teller(bankRef);
			
			
			out.writeObject(teller1);
			
			out.writeObject(teller2);
			
			
			
		}
		
		
		
	}
}
