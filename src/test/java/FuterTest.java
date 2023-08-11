import java.util.concurrent.*;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-10 19:47
 */
public class FuterTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            new Thread(() ->{
                System.out.println(1);
                countDownLatch.countDown();
            }).start();

        }

        countDownLatch.await();
        System.out.println(":任务调用完成~");


        CyclicBarrier cyclicBarrier = new CyclicBarrier(5);

        for (int i = 0; i < 5; i++) {
            new Thread(() ->{
                System.out.println(2);
                try {
                    cyclicBarrier.await();
                    System.out.println(6);
                } catch (InterruptedException | BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }
}
