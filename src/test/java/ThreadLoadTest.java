import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-10 16:04
 */
public class ThreadLoadTest {
    String name = "1";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<Object> threadLocal = new ThreadLocal<>();
        threadLocal.set(2);
        ThreadLoadTest t = new ThreadLoadTest();
        new Thread(() -> {
            System.out.println(1);
            t.setName("2");
            System.out.println(Thread.currentThread().getName());
        }).start();


        new Thread(() -> {
            System.out.println("线程b启动");
            System.out.println(threadLocal.get());
        }, "b").start();

        System.out.println(threadLocal.get());
        Thread.sleep(2);
        System.out.println(t.getName());
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                16,
                26,
                3,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(20)
        );

        poolExecutor.submit(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        });
    }
}
