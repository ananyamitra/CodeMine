package com.examples.myproject;

import java.util.LinkedList;
import java.util.Queue;

public class BQueue<T> {

    private Queue<T> q = new LinkedList<T>();
    private int limit;

    public BQueue(int limit) {
        this.limit = limit;
    }

    public synchronized void put(T t) throws InterruptedException {
        while (isFull())
            wait();
        q.add(t);
        notifyAll();
    }


    public synchronized T take() throws InterruptedException {
        while (isEmpty())
            wait();
        T t = q.poll();
        notifyAll();
        return t;
    }

    private boolean isEmpty() {
        return q.size() == 0;
    }
    private boolean isFull() {
        return q.size() == limit;
    }
}
