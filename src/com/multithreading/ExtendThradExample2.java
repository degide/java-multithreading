package com.multithreading;

public class ExtendThradExample2 extends Thread{
    private String thread_name;
    private int num;

    public ExtendThradExample2(String name, int num){
        this.setThread_name(name);
        this.setNum(num);
    }

    @Override
    public void run() {
        for(int i=0; i<this.num; i++){
            System.out.println("From Thread "+this.getThread_name()+": "+i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }

    public int getNum() {
        return num;
    }

    public String getThread_name() {
        return thread_name;
    }

    public void setThread_name(String thread_name) {
        this.thread_name = thread_name;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
