package org.example.MyCollections;

public class MySet <T extends Comparable<T>>{
    private int hashFunction(T v){
        return ((v.toString()).length() * (((v.toString()).length() - 7)*3) % size);
    }
    private int size;
    private MyList<T>[] arr;
    public MySet(){
        size = 100;
        arr = new MyList[size];
    }
    public MySet(int size){
        this.size = size;
        arr = new MyList[size];
    }
    public void add(T v){
        int index = hashFunction(v);
        if(arr[index] == null){
            arr[index] = new MyList();
            arr[index].pushBack(v);
        }else{
            if(!arr[index].contains(v)){
                arr[index].pushBack(v);
            }
        }
    }
    public void delete(T v){
        int index = hashFunction(v);
        if(arr[index] != null){
            arr[index].removeByValue(v);
        }
    }
    public void printSet(){
         for(int i = 0; i < size;i++){
             if(arr[i] != null){
                 arr[i].printList();
             }
         }
    }
}

