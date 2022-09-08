package com.besant.multithreading.states;

public class WaitingState implements Runnable {
    public static Thread t1;

    public static void main(String[] args) throws InterruptedException {
        t1 = new Thread(new WaitingState());
        t1.start();

    }

    public void run() {
        Thread t2 = new Thread(() -> System.out.println(WaitingState.t1.getState()));
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
        }
    }
}
