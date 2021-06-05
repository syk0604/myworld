package com.lock.synchr;

import java.util.Queue;

/**
 * Administrator
 * 2021/5/19
 */
public class Consumer implements Runnable{
    Queue queue;
    int max_size;

    public Consumer(Queue queue, int max_size) {
        this.queue = queue;
        this.max_size = max_size;
    }

    @Override
    public void run() {
        while(true){
            synchronized (queue){
                while(queue.isEmpty()){
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
                System.out.println("消费者开始消费"+queue.remove());
                queue.notify();
            }
        }
    }
}
