package com.calculation;

public class Multiplication {
    synchronized public void multiply(Long number) throws Exception{
        for(int i = 1; i<=number; i++){
            System.out.println(i+"x"+number+" = "+(i*number));
            Thread.sleep(1000);
        }
    }
}
