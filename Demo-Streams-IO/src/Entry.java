import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Entry {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fileName = "test.prmtv";
		
		try(FileOutputStream fOut = new FileOutputStream(fileName)){
			IOUtils.writePrimitives(fOut);
		}
		
		try(FileInputStream fIn = new FileInputStream(fileName)){
			IOUtils.readPrimitives(fIn);
		}
		
		
		
	}
}
