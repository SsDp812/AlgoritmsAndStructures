package org.example.MyUtils;

public class UtilForArrays {
    public static <T> void printInt(T[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
