package com.lock;

/**
 * Administrator
 * 2021/5/19
 */
public class SynchrinozedDemo {
    static int count;
    public  static synchronized void incr() throws InterruptedException {
        count++;

    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{

                    try {
//                        Thread.sleep(1);
                        incr();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

            }).start();
        }
        Thread.sleep(2000);
        System.out.println(count);
    }
}
