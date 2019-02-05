package me.arthurl.teste;

import java.util.Random;

public class DynamicTask implements Runnable {

    @Override
    public void run() {
        try {
            final int val = new Random().nextInt(500);
            System.out.printf("[%s] Sleeping %d ms \n", Thread.currentThread().getName(), val);
            Thread.sleep(val);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
