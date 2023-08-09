import javax.swing.tree.TreeNode;
import java.util.Stack;
import java.util.TreeMap;

public class ArrayStack<T> {
    private Object[] array;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
        this.top = -1;
    }

    public void push(T item) {
        if (top == capacity - 1) {
            throw new IllegalStateException("Stack is full");
        }
        array[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = (T) array[top];
        array[top--] = null; // Clear the reference
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();


    }


    public static boolean isValid(String s) {
        StringBuilder builder = new StringBuilder();
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            stack.push(charArray[i]);
        }
        for (int i = 0; i < charArray.length; i++) {
            builder.append(stack.pop());
        }

        System.out.println(builder);
        return true;
    }

}
