package producerconsumer;

public class Entry {
public static void main(String[] args) {
	Container container =new Container();
	Thread thread1= new Producer("thread1",container);
	thread1.start();
	Thread thread2= new Consumer("thread2",container);
	thread2.start();
	Thread thread3= new Producer("thread3",container);
	thread3.start();
	Thread thread4= new Consumer("thread4",container);
	thread4.start();
	Thread thread5= new Producer("thread5",container);
	thread5.start();
	Thread thread6= new Consumer("thread6",container);
	thread6.start();
}
}
