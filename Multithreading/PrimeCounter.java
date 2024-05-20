package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class PrimeCounter {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 23, 29, 31, 37, 41, 43, 47, 49,};

        AtomicInteger primeCount = new AtomicInteger(0);

        int mid = numbers.length / 2;
        int[] firstHalf = new int[mid];
        int[] secondHalf = new int[numbers.length - mid];

        System.arraycopy(numbers, 0, firstHalf, 0, mid);
        System.arraycopy(numbers, mid, secondHalf, 0, numbers.length - mid);

        Thread t1 = new Thread(() -> {
            int count = countPrimes(firstHalf);
            System.out.println("Thread 1 found " + count + " prime numbers.");
            primeCount.addAndGet(count);
        });

        Thread t2 = new Thread(() -> {
            int count = countPrimes(secondHalf);
            System.out.println("Thread 2 found " + count + " prime numbers.");
            primeCount.addAndGet(count);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Total prime numbers: " + primeCount.get());
    }

    private static int countPrimes(int[] numbers) {
        int count = 0;
        for(int num : numbers) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    

}
