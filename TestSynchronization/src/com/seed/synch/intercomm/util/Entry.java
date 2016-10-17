package com.seed.synch.intercomm.util;

public class Entry {
	public static void main(String[] args) {
		Container container = new Container();
		
		new ProducerThread(container).start();
		new ConsumerThread(container).start();
	}
}

class ProducerThread extends Thread{
	private Container container;
	
	public ProducerThread(Container container) {
		this.setName("PT");
		this.container = container;
	}

	@Override
	public void run() {
		try {
			while(true){
				container.put();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


class ConsumerThread extends Thread{
	private Container container;
	
	public ConsumerThread(Container container) {
		this.setName("CT");
		this.container = container;
	}

	@Override
	public void run() {
		try {
			while(true){
				container.get();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
