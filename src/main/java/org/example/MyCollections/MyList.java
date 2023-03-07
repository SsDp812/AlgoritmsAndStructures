package org.example.MyCollections;

import java.util.Objects;

public class MyList <T>{
    element head;
    element tail;
    private int length;
    class element{
        public element(T v){
            value = v;
            prev = null;
        }
        T value;
        element prev;
    }
    public <T> MyList(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    public void pushBack(T v){
        element el = new element(v);
        if(head == null){
            head = el;
            tail = el;
        }else{

            tail.prev = el;
            tail = el;
        }
    }
   public T getByIndex(int i){
       element el = head;
       int index = 0;
       if(i >= 0 && i < length){
           while(index != i){
               el = el.prev;
               index++;
           }
           return el.value;
       }
      return null;
   }
   public void removeByIndex(int i){
        if(i == 0){
            head = head.prev;
        }else{
            element el = head;
            int index = 0;
            if(i >= 0 && i < length){
                while(index != i){
                    el = el.prev;
                    index++;
                }
                el.prev = el.prev.prev;
            }
        }
   }
   public void removeByValue(T v){
        if(head.value == v){
            head = head.prev;
        }else{
            element el = head;
            int index = 0;
            while(!Objects.equals(el.prev.value,v) && index <= length){
                el = el.prev;
                index ++;
            }
            el.prev = el.prev.prev;
        }
   }
    public boolean contains(T v){
        element el = head;
        while(el != null){
            if(Objects.equals(el.value,v)){
                return true;
            }
            el = el.prev;
        }
        return false;
    }
   public void printList(){
        element el = head;
        while(el != null){
            System.out.println(el.value);
            el = el.prev;
        }
   }

}
