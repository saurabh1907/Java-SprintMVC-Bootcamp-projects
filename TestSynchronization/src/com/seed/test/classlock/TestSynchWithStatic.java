package com.seed.test.classlock;

public class TestSynchWithStatic {
	private static boolean flag;
	
	
	public static void main(String[] args) {

		new Thread("EVEN") {
			@Override
			public void run() {
				
				TestSynchWithStatic.runEvenLoop();
			}
		}.start();

		new Thread("ODD") {
			@Override
			public void run() {
				TestSynchWithStatic.runOddLoop();
			}
		}.start();
		
	}

//	synchronized
	public static void runEvenLoop() {
		try {
			for (int value = 0; value < 50; value++) {
				if (value % 2 == 0){

					synchronized(TestSynchWithStatic.class){
							while(flag){
//								this.wait();
								TestSynchWithStatic.class.wait();
							}
							
							System.out.println(Thread.currentThread().getName() + ": "+ value);
							Thread.sleep(800);
							
							flag = true;
							TestSynchWithStatic.class.notify();
					}
				}
					
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized
	public static void runOddLoop() {
		try {
			for (int value = 0; value < 50; value++) {
				if (value % 2 != 0){
							
					synchronized (TestSynchWithStatic.class) {
						while(!flag){
							TestSynchWithStatic.class.wait();
						}

						System.out.println(Thread.currentThread().getName() + ": "+ value);
						Thread.sleep(500);
						
						flag = false;
						TestSynchWithStatic.class.notify();
					}		
					
				}					
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
