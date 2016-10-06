package com.lab;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOUtils {
public void write(){
	
}
public void readPrimitivefile(InputStream in) throws IOException{
	try(DataInputStream din= new DataInputStream(in)){
		long lValue=dln.readLong();
		System.out.println(Value+"\t|");
		
	}
}
}
