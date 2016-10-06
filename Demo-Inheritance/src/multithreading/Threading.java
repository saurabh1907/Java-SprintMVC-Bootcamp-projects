package multithreading;

public class Threading {
public static void main(String[] args) {
	System.out.println("hello world");;
	Thread t= new  MySimpleThread();
	t.start();
	t.run();
}
}
