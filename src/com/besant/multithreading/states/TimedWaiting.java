package com.besant.multithreading.states;

public class TimedWaiting {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable= () ->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread= new Thread(runnable);
        thread.start();
        Thread.sleep(1000);
        System.out.println(thread.getState());



    }
}
