import org.junit.BeforeClass;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-10 12:48
 */
public class Test4 {
    public static void main(String[] args) {
//        传入true 表示该锁为公平锁
//        公平锁： 先等待的线程先获取锁，性能比较差
//        非公平锁： 先等待的线程不一定先获得锁，是有其他优先级排序而获得锁，性能比较高 但是会有锁饥饿问题。
//        锁饥饿： 某个线程一直无法获得锁，导致一直堵塞。
        Lock lock = new ReentrantLock(true);
        Condition condition = lock.newCondition();
        new Thread(() -> {
            lock.lock();
            try {
                condition.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(123);
            lock.unlock();
        }, "a").start();

    }
}

class Dog {
    private String name;
    private Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
