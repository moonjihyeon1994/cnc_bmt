package com.cnc.rating.logging;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

@SpringBootTest
class LoggingTest {

    private static final int THREAD_POOL_SIZE = 100;
    private static final Executor EXECUTOR = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

    @Test
    public void test() {
        List<CompletableFuture<String>> completableFutures = new ArrayList<>();
        IntStream.range(0, 100).forEach(n -> completableFutures.add(
                CompletableFuture.supplyAsync(
                        () -> task(String.valueOf(n)), EXECUTOR
                )
        ));

        CompletableFuture.allOf(completableFutures.toArray(new CompletableFuture[completableFutures.size()]))
                .thenAccept(consumer -> completableFutures.forEach(c -> System.out.println(c.join())));
    }

    private static String task(String i) {
        System.out.println(Thread.currentThread().getName() + " : started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i;
    }
}