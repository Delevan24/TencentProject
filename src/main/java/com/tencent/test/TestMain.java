package com.tencent.test;

import java.util.concurrent.*;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("hello");
        People people = new People("xiaoxiao", 10);
        System.out.println(people.toString());
        TimeUnit unit;
        BlockingQueue workQueue;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        executorService.shutdown();
        People people11 = new People("xiaoxiao", 10);

        People people1 = new People("xiaoxiao", 10);
        People people2 = new People("xiaoxiao", 10);
        People people4 = new People("xiaoxiao", 10);
        People people5 = new People("xiaoxiao", 10);
        People people6 = new People("xiaoxiao", 10);
        People people7 = new People("xiaoxiao", 10);
        People people8 = new People("xiaoxiao", 10);
        People people9 = new People("xiaoxiao", 10);
        People people10 = new People("xiaoxiao", 10);

    }
}

