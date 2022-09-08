package com.besant.multithreading.states;

public class Blocked {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1= new Thread(() ->  printMethod());
        Thread thread2= new Thread(() ->  printMethod());
        thread1.start();
        thread2.start();
        Thread.sleep(1000);
        System.out.println(thread2.getState());
    }

    private static synchronized void printMethod() {
        while (true){

        }
    }
}
