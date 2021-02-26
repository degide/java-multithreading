package com.calculation;

public class Main {
    public static void main(String[] args){
        FirstMultiplicator st = new FirstMultiplicator(5L, new Multiplication());
        SecondMultiplicator nd = new SecondMultiplicator(8L, new Multiplication());
        st.start();
        nd.start();
    }
}
