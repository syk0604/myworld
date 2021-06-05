package com.lock;

import com.sun.org.apache.xerces.internal.parsers.CachingParserPool;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Administrator
 * 2021/5/18
 */
public class RentrentLockDemo {
    static Lock lock = new ReentrantLock();

    public static void incr() {
        lock.lock();
        //TODO
        System.out.println(Thread.currentThread() + "获的锁");
        lock.unlock();

    }

    public static void main(String[] args) throws InterruptedException {
        Thread threadB = new Thread(() -> {
            RentrentLockDemo.incr();
        }, "thread-b");
        threadB.start();
        Thread threadA = new Thread(() -> {
            while (true) {
                RentrentLockDemo.incr();
            }
        }, "thread-a");
        threadA.start();
Thread.sleep(2000);
    }
}
