package com.pool;

import java.time.LocalDateTime;

public class Job implements Runnable {
    private String name;

    public Job(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(200);
            for (int i = 0; i < 5; i++) {
                System.out.println("Executing task:" + i + " from:" + getName() + " at:" + LocalDateTime.now());
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

        public String getName(){
            return this.name;
        }
}
