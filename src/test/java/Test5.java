import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.StampedLock;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-10 15:25
 */
public class Test5 {
    public static void main(String[] args) {
        StampedLock stampedLock = new StampedLock();
        long l = stampedLock.writeLock();


        stampedLock.unlock(l);
    }
}
