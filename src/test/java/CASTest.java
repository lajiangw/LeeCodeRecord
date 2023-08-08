import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-05 14:19
 */
public class CASTest {
    public static void main(String[] args) {
        Pig xh = new Pig("小红", 10);
        Pig xm = new Pig("小明", 20);
        AtomicStampedReference<Pig> reference = new AtomicStampedReference<Pig>(xh, 1);
        System.out.println("默认对象：" + reference.getReference() + reference.getStamp());
        boolean b = reference.compareAndSet(xh, xm, 1, 2);
        System.out.println(b);
        System.out.println("修改后的对象：" + reference.getReference() + reference.getStamp());

    }
}

class Pig {
    private String name;
    private Integer age;

    public Pig(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
