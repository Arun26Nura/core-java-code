package com.besant.multithreading;

class Hi  extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi" + i);
        }
    }
}

class Hello extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello" + i);
        }
    }
}

public class ThreadDemo1{

    public static void main(String[] args) {
        Hi obj1= new Hi();
        Hello obj2= new Hello();
        var thread1= new Thread(obj1);
        var thread2= new Thread(obj2);

        thread1.start();
        thread2.start();
    }


}
