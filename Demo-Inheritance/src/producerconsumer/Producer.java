package producerconsumer;

public class Producer extends Thread {
	Container container;
	Producer(String name, Container container){
		super(name);
		this.container=container;
	}
@Override
public void run() {
	//super.run();
	try {
		container.put();

	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
