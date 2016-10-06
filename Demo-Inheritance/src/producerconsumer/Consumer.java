package producerconsumer;

public class Consumer extends Thread {
	Container container;
	Consumer(String name, Container container){
		super(name);
		this.container=container;
	}
@Override
public void run() {
	//super.run();
	try {
		container.get();

	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
