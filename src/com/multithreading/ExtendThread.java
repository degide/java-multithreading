package com.multithreading;

/**
 * Multithreading by Extending Thread class
 * @author Harerimana Egide
 * @since 2021-02-11
 */
public class ExtendThread extends Thread {

    public int num;
    public String threadName;

    public ExtendThread(int number, String thread_name){
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
     * Testing encapsulation: <b>Do something before start by overriding start()</b>
     * <br/><br/>COMMENT IF NOT NEEDED!
     */
    @Override
    public void start(){
        Thread th = null;
        System.out.println("Testing encapsulation");
        if(th==null){
            th = new Thread(this, "Test");
            th.start();
        }
    }
    /**End*/

    @Override
    public void run() {
        for(int i=0; i<=getNum(); i++){
            System.out.println("Thread: "+getThreadName()+", i: "+i);
        }
    }
}