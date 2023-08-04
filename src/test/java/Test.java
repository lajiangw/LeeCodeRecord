import javax.swing.tree.TreeNode;
import java.awt.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.*;
import java.util.List;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-04 11:39
 */
public class Test {
    public static void main(String[] args) {
        String[] arr = new String[]{"1", "2", "3"};
        List<String> list = Test.asList(arr);
        list.add("2");

                System.out.println(list);
    }


    public static <T> List<T> asList(final T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

}

class Book implements Comparable<Book> {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        if (this.price > o.price) {
            return 1;
        }
        if (this.price < o.price) {
            return -1;
        }

        return 0;
    }
}
