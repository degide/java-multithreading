package com.multithreading;

/**
 * Multi-threading by implementing <b>Runnable Interface</b>
 * @author Harerimana Egide
 * @since 2021-02-12
 */
public class ImplementRunnable implements Runnable{

    public int num;
    public String threadName;

    /**
     * Constructor of ImplementThread class
     * @param number the counter number
     * @param thread_name the name to help us differentiate threads
     */
    public ImplementRunnable(int number, String thread_name){
        this.num = number;
        this.threadName = thread_name;
    }

    public int getNum() {
        return num;
    }

    public String getThreadName() {
        return threadName;
    }

    /**
     * Here we need to add start method as Runnable interface doesn't
     * have a start method. <b>Here ImplementRunnable class is passed to Thread class</b>
     */
    public void start(){
        Thread th = null;
        if(th==null){
            th = new Thread(this, "Test");
            th.start();
        }
    }

    @Override
    public void run() {
        for(int i=0; i<=getNum(); i++){
            System.out.println("Thread: "+getThreadName()+", i: "+i);
        }
    }

}
