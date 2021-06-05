package com.lock.synchr;

import java.util.Queue;

/**
 * Administrator
 * 2021/5/19
 */
public class Product implements Runnable {
    Queue queue;
    int max_size;

    public Product(Queue queue, int max_size) {
        this.queue = queue;
        this.max_size = max_size;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            synchronized (queue) {
                i++;
                while (max_size == queue.size()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("生产者开始生产消息" + i);
                queue.add(i);
                queue.notify();
            }
        }
    }
}
