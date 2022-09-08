package com.besant.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {
        Runnable r1 = new Task("task 1");
        Runnable r2 = new Task("task 2");
        Runnable r3 = new Task("task 3");
        Runnable r4 = new Task("task 4");
        Runnable r5 = new Task("task 5");

        // creates a thread pool with MAX_T no. of
        // threads as the fixed pool size(Step 2)
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // passes the Task objects to the pool to execute (Step 3)
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        pool.shutdown();
    }
}

class Task implements Runnable{
    String task;

    public Task(){

    }
    public Task(String task){
        this.task=task;
    }

    @Override
    public void run() {
        for(int i=0;i<=3;i++) {
            System.out.println("Task name is : " + task);
        }
        System.out.println(task+" complete");
    }

}
