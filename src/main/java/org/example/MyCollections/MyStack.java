package org.example.MyCollections;

public class MyStack <T> {
    element head;
    class element {
        public element(T v){
            value = v;
            prev = null;
        }
        T value;
        element prev;
    }
    public MyStack(){
        head = null;
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
        }else{
            el.prev = head;
            head = el;
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
