package com.tenni;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.*;

@Slf4j
public class Aa {

    private static Executor executor = newFixedThreadPool(10);

    public static void main(String ... args){
        task();
    }

    public static void task(){

    for (int i=0;i<20;i++){
        executor.execute(new Task());
    }

    }

    static class Task implements Runnable{

        @Override
        public void run() {
            log.info(Thread.currentThread().getName());
        }
    }
}
