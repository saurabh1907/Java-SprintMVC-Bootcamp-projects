package producerconsumer;

public class Container {
	static int size = 0;

	synchronized 
	public void put() throws InterruptedException {
		while (size == 1) {
			System.out.println("producer waiting "+ Thread.currentThread().getName());
			this.wait();
			
		}
		size = 1;
		System.out.println("producer produced "+ Thread.currentThread().getName());
		this.notify();
	}

	synchronized 
	public void get() throws InterruptedException {
		while (size == 0) {
			System.out.println("consumer waiting "+ Thread.currentThread().getName());
			this.wait();
			
		}
		size = 0;
		System.out.println("consumer consumed "+ Thread.currentThread().getName());
		this.notify();
	}
}
