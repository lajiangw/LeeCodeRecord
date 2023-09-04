package com.zml;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-09-04 18:30
 */
public class Solution225 {

}

class MyStack {
//    使用两个队列实现 队列的特性 先进先出
//    栈则是 先进后出
    Queue<Integer> queue1;
    Queue<Integer> queue2;


    public MyStack() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}

class MyStack2 {
//    使用一个队列来实现
    Queue<Integer> queue;

    public MyStack2() {
        queue = new LinkedList<Integer>();
    }

    public void push(int x) {
        int n = queue.size();
        queue.offer(x);
//        将 新加入的元素 放到栈顶
        for (int i = 0; i < n; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
