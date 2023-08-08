import java.sql.Time;
import java.util.concurrent.*;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-05 16:02
 */
public class Pool {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        int corePoolSize = 5;             // 核心线程数
        int maxPoolSize = 10;             // 最大线程数
        long keepAliveTime = 1;           // 线程空闲时间
        TimeUnit unit = TimeUnit.MINUTES; // 时间单位
        int queueCapacity = 100;          // 任务队列容量

        // 创建 ThreadPoolExecutor，使用自定义参数
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                corePoolSize,
                maxPoolSize,
                keepAliveTime,
                unit,
                new ArrayBlockingQueue<>(queueCapacity) // 任务队列，这里使用了一个有界阻塞队列
                , new ThreadPoolExecutor.CallerRunsPolicy());

        Future<String> submit = threadPool.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("88");
            return "aa";
        });

        System.out.println(submit.get(2, TimeUnit.SECONDS));
        threadPool.shutdown();
        System.out.println(threadPool.isShutdown());
        System.out.println(threadPool.isTerminated());
    }


}

