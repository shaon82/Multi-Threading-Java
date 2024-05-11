public class Main {
    public static void main(String[] args) {
        ThreadLocalDemo threadLocalDemo = new ThreadLocalDemo();

        Thread t1 = new Thread(threadLocalDemo);
        Thread t2 = new Thread(threadLocalDemo);
        Thread t3 = new Thread(threadLocalDemo);
        Thread t4 = new Thread(threadLocalDemo);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}