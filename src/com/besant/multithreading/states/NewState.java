package com.besant.multithreading.states;

public class NewState {
    public static void main(String[] args) {
        Thread thread1= new Thread(()->{});
        System.out.println(thread1.getState());
    }
}
