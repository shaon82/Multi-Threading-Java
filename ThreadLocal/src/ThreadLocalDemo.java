public class ThreadLocalDemo implements Runnable {

    int counter;

    ThreadLocal<Integer> threadLocalCounter = new ThreadLocal<>();


    @Override
    public void run() {

        counter++;
        if (threadLocalCounter.get() != null) {
            threadLocalCounter.set(threadLocalCounter.get().intValue() + 1);
        } else {
            threadLocalCounter.set(0);
        }
        System.out.println("Counter : " + counter);
        System.out.println("threadLocalCounter : " + threadLocalCounter.get());

    }
}
