import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-07 14:46
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("5.2");
        BigDecimal b2 = new BigDecimal("5.1");
        BigDecimal add = b1.add(b2);
        System.out.println(b1.subtract(b2));
        System.out.println(b1.divide(b2, 2));
        System.out.println(b2.compareTo(b1));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        BigDecimal t1 = new BigDecimal("5.22");
        BigDecimal t2 = new BigDecimal("5.220");
        System.out.println(t1.equals(t2));
        System.out.println(t1.compareTo(t2));
    }

    @Test
    public void setBigInter() {
        BigInteger b1 = new BigInteger("1111111111111111111111111111111111111111");
        BigInteger b2 = new BigInteger("1111111111111111111111111111111111111111");
        new Object();
        System.out.println(b1.add(b2));
    }

    @Test
    public void test2() {
        HashSet<Integer> set = new HashSet<>();
        System.out.println(set.add(1));
        System.out.println(set.add(1));
        set.forEach(System.out::println);
        int k = 8 & 2;
        System.out.println(k);
    }
}

class Person implements Comparable<Person> {
    private Integer age;


    @Override
    public int compareTo(Person o) {
        if (age > o.age) {
            return -1;

        }

        if (age.equals(o.age)) {
            return 0;
        }
        return 1;
    }
}
