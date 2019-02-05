package me.arthurl.teste;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static final int TASKS_TO_EXECUTE = 100000;
    private static final int THREADPOOL_SIZE = 16;

    public static void main(String[] args) {
        ExecutorService benchmarkExecutor = Executors.newFixedThreadPool(THREADPOOL_SIZE);

        //Thread to assign jobs to threadpool
        new Thread(()->{
            for (int i = 0; i < TASKS_TO_EXECUTE; i++){
                benchmarkExecutor.submit(new DynamicTask());
            }

        }).start();

        //Simple enter exit
        while (true){
           if (new Scanner(System.in).hasNextLine()){
               System.exit(1);
           }
        }
    }

}
