package cn.edu.nwpu;

import java.util.Stack;

/**
 * @ClassName MyStack
 * @Author: wkx
 * @Date: 2019/3/21 14:12
 * @Version: v1.0
 * @Description:
 */
public class MyStack {
    private static int CAPACITY = 1024;
    private int capacity;
    private Object[] objects;
    private int top = -1;

    public MyStack(){
        objects = new Object[CAPACITY];
    }

    public MyStack(int capacity) {
        this.capacity = capacity;
        objects = new Object[capacity];
    }

    public void push(Object obj){
        objects[++top] = obj;
    }

    public Object peek(){
        if (top < 0)
            throw new RuntimeException();
        return objects[top];
    }

    public Object pop(){
        if (top < 0)
            throw new RuntimeException();
        Object popOut = objects[top];
        objects[top--] = null;
        return popOut;
    }

}
