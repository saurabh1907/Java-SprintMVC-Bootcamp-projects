class Test extends Thread{
    public static void main(String argv[]){
        Test  b = new Test();
        b.start();
        System.out.println("main");
    }
    public void run(){      
        System.out.println("Running");
    }
}