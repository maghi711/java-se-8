package com.maghi711.javase8.lambda;

public class SecondLambdaUsingRunnable {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("hello from = " + Thread.currentThread().getName());
                }
            }
        };

        Runnable lambdaRunner = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("hello from lambda runner = " + Thread.currentThread().getName());
            }
        };

        Thread t = new Thread(lambdaRunner);
        t.start();
        t.join();
    }
}
