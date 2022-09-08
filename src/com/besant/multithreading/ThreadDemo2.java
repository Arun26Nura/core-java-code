package com.besant.multithreading;

public class ThreadDemo2 {

    public static void main(String[] args) {

        Runnable t1= () -> print("Hi");
        Runnable t2= () -> print("Hello");

        Thread thread1= new Thread(t1);
        Thread thread2= new Thread(t2);
        thread1.start();
        thread2.start();

    }

    private static void print(String input) {
        for(int i=0;i<5;i++) {
            System.out.println(input);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
