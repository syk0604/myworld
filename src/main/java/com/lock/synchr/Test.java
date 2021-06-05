package com.lock.synchr;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Administrator
 * 2021/5/19
 */
public class Test {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        int max_size = 5;
        Thread thread1 = new Thread(new Product(queue, max_size));
        Thread thread2 = new Thread(new Consumer(queue, max_size));
        thread1.start();
        thread2.start();
    }
}
