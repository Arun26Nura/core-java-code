package com.besant.multithreading.states;

public class RunnableState {
    public static void main(String[] args) {
        Thread thread1= new Thread(()->{});
        thread1.start();
        System.out.println(thread1.getState());
    }
}
