public class ThreadDemo extends Thread {

    private Thread thread;
    private String threadName;
    PrintDemo printDemo;

    public ThreadDemo(String name, PrintDemo pd) {
        this.threadName = name;
        this.printDemo = pd;
    }

    public void run() {
        synchronized (printDemo) {
            printDemo.print();
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting " +  threadName );
        if (thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
