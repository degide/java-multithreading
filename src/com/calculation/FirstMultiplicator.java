package com.calculation;

public class FirstMultiplicator extends Thread{

    private Long number;
    private Multiplication multiplication;

    public FirstMultiplicator(Long number, Multiplication multiplication){
        this.number=number;
        this.multiplication=multiplication;
    }

    @Override
    public void run() {
        try{
            multiplication.multiply(number);
        }catch(InterruptedException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
