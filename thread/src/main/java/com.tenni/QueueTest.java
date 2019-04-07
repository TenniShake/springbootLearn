package com.tenni;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Queue;

@Slf4j
public class QueueTest {
    // 定义一个队列
    static Queue<String> queue;

    static {
        queue = new LinkedList<String>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");

    }

    public static void main(String ... args){
        testPoll();
        testRemove();
    }

    static void testPoll(){
        String ele = queue.poll();
        log.info("ele {}",ele);
        ele = queue.poll();
        log.info("ele {}",ele);
        ele = queue.poll();
        log.info("ele {}",ele);
        ele = queue.poll();
        log.info("ele {}",ele);
    }

    static void testRemove(){
        String ele = queue.remove();
        ele = queue.remove();
    }
    static void testTake(){
        boolean ele = queue.offer("dfs");
    }
}
