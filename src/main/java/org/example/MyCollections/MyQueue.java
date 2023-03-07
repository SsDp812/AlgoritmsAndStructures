package org.example.MyCollections;

public class MyQueue <T> {
    element head;
    element tail;
    class element{
        public element(T v){
            value = v;
            prev = null;
        }
        T value;
        element prev;
    }
    public MyQueue(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    public void push(T v){
        element el = new element(v);
        if(head == null){
            head = el;
            tail = el;
        }else{

            tail.prev = el;
            tail = el;
        }
    }
    public T pop(){
        if(head != null){
            T v = head.value;
            head = head.prev;
            return v;
        }else{
            return null;
        }
    }
}
