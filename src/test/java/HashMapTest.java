import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ZhangMinlei
 * @description 多线程hashmap测试
 * @date 2023-08-05 17:48
 */
public class HashMapTest {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        new Thread(() -> {
            System.out.println("aaa");
            map.put(1, 1);
        }, "a").start();

        new Thread(() -> {
            System.out.println("bbb");
            map.put(2, 2);
        },"b").start();

        Thread.sleep(1);
        System.out.println(map.get(1));
    }
}
