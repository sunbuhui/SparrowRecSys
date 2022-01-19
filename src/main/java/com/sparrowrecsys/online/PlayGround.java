package com.sparrowrecsys.online;

import java.util.concurrent.*;

public class PlayGround {
    //        private static ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 3, 1000, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
    private static ThreadPoolExecutor pool = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);

    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<Integer, Integer> candidateMap = new ConcurrentHashMap<>();
        pool.execute(() -> {
            for (int i = 0; i < 10; i++) {
                candidateMap.put(i, i);
            }
            System.out.println(1);
        });
        pool.execute(() -> {
            for (int i = 10; i < 20; i++) {
                candidateMap.put(i, i);
            }
            System.out.println(2);
        });
        pool.execute(() -> {
            for (int i = 20; i < 30; i++) {
                candidateMap.put(i, i);
            }
            System.out.println(3);
        });
//        while (pool.)
        System.out.println(candidateMap.size());
    }
}
