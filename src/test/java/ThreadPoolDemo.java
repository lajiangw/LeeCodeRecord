import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-10 18:22
 */
public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        xgpool();
    }

    public static ThreadPoolExecutor buildThreadPoolExecutor() {
        return new ThreadPoolExecutor(2,
                5,
                60,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(10)
        );
    }

    private static void xgpool() throws InterruptedException {
        ThreadPoolExecutor ex = buildThreadPoolExecutor();
        for (int i = 0; i < 15; i++) {
            ex.submit(() -> {
                try {
                    System.out.println(1);
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }


        System.out.println("修改前");
        System.out.println(ex.getCorePoolSize() +" "+ ex.getMaximumPoolSize());
        System.out.println("修改后");
        ex.setCorePoolSize(10);
        ex.setMaximumPoolSize(10);
        System.out.println(ex.getCorePoolSize() + ex.getMaximumPoolSize());
        Thread.currentThread().join();
    }
}
