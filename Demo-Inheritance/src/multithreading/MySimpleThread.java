package multithreading;

public class MySimpleThread extends Thread{
@Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	System.out.println("inside");
	try {
		sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
