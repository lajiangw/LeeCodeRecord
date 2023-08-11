package factory;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-11 17:13
 */
public class BDog implements Dog{
    @Override
    public void eat() {
        System.out.println("B小狗吃馒头~");
    }
}
