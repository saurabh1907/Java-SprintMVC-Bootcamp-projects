package com.cg;

import java.util.LinkedList;
import java.util.List;

public class InMemoryDAOImpl implements IDao{
	@Override
	public List<String> getMessages() {

		String message1 = "Hello, world!";
		String message2 = "How are you?!";
	
		List<String> messages = new LinkedList<>();
		
		messages.add(message2);
		messages.add(message1);
		
		return messages;
	}
}
