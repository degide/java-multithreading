package com.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception{
        Job job1 = new Job("Thread1");
        Job job2 = new Job("Thread2");
        Job job3 = new Job("Thread2");
        Job job4 = new Job("Thread2");
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(job1);
        pool.execute(job2);
        pool.execute(job3);
        pool.execute(job4);
        pool.shutdown();
    }
}
