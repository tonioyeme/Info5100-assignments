package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class ConcurrentQueue<T> {

    private Queue<T> queue;
    public Object objlock = new Object();
    public ConcurrentQueue(){
        queue = new LinkedList<>();
    }

    public void add(T data) {
        synchronized (objlock){
            queue.add(data);
        }

    }

    public void remove(T data){
        synchronized (objlock){
            queue.remove(data);
        }
    }

    public T peek(){
        synchronized (objlock){
            return queue.peek();
        }

    }

    public boolean isEmpty(){
        synchronized (objlock){
            return queue.isEmpty();
        }
    }


}
