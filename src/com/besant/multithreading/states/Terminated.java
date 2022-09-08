package com.besant.multithreading.states;

public class Terminated {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1= new Thread(()->{});
        thread1.start();
        Thread.sleep(1000);
        System.out.println(thread1.getState());
    }
}
