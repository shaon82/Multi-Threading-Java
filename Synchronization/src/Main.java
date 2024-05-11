public class Main {
    public static void main(String[] args) {

        PrintDemo printDemo = new PrintDemo();
        ThreadDemo threadDemo = new ThreadDemo("Thread 1", printDemo);
        ThreadDemo threadDemo1 = new ThreadDemo("Thread 2",printDemo);
        threadDemo.start();
        threadDemo1.start();

        try {
            threadDemo.join();
            threadDemo1.join();
        }catch (Exception e){
            System.out.println("Interrupted");
        }
    }
}