import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-09 12:26
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new CopyOnWriteArrayList<>();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
        }, "a").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
        }, "b").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
        }, "c").start();


        Thread.sleep(3);
        list.forEach(System.out::println);
    }

    @Test
    public void tset() {
        List<Integer> list = new ArrayList();
        list.add(1);
        CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<>(list);
        copy.add(2);
        copy.add(0, 0);
        copy.addIfAbsent(0);
        copy.forEach(System.out::println);

    }


}


