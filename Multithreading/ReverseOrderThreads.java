package Multithreading;

import java.util.concurrent.CountDownLatch;

public class ReverseOrderThreads {
    public static void main(String[] args) {
        final int numThreads = 50;
        final CountDownLatch latch = new CountDownLatch(numThreads);

        for (int i = 0; i < numThreads; i++) {
            final int threadNum = i;
            new Thread(() -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Hello from thread " + threadNum);
            }).start();

            latch.countDown();
        }
    }
}
