package com.seed.synch.intercomm.util;

public class Container {
	private boolean isItemAvailable;
	
	
	synchronized
	public void put() throws InterruptedException{
		while(isItemAvailable){
			this.wait();
		}
		
		Thread.sleep(800);
		System.out.println("PUT");
		
		isItemAvailable = true;
		this.notify();
		
	}
	
//	synchronized
	public void get() throws InterruptedException{
		while(!isItemAvailable){
			this.wait();
		}
		
		Thread.sleep(600);
		System.out.println("GET");
		
		isItemAvailable = false;
		this.notify();
	}
}
