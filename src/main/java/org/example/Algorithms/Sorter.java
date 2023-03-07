package org.example.Algorithms;

import org.example.MyUtils.UtilForArrays;


public class Sorter {
    static public <T extends Comparable<T>> void Sort(T[] arr){
        int lastIndex = arr.length - 1;
        while(lastIndex >= 1){
            T max = arr[0];
            int index = 0;
            for(int i = 0; i < lastIndex;i++){
                if(arr[i].compareTo(max) > 0){
                    max = arr[i];
                    index = i;
                }
            }
            for(int i = index; i < lastIndex;i++){
                arr[i] = arr[i+1];
            }
            arr[lastIndex] = max;
            lastIndex--;
            UtilForArrays.printInt(arr);
        }

    }

//    static public void quickSort(int[] arr, int low, int high){
//        if(arr.length <=1){
//            return;
//        }
//        else if(arr.length == 2){
//            int[] newArr = new int[2];
//            if(arr[0] < arr[1]){
//                newArr[0] = arr[0];
//                newArr[1] = arr[1];
//            }else{
//                newArr[0] = arr[1];
//                newArr[1] = arr[0];
//            }
//        }else{
//            int pivot = arr[low];
//            int pivotIndex = low;
//            for(int i = low; i <=high;i++ ){
//                if(arr[i] <= pivot){
//                    int temp = pivot;
//
//                    arr[pivotIndex] = arr[i];
//                    for(int j = pivotIndex + 1; j <= high;j++){
//                        arr[j]
//                    }
//                    arr[pivotIndex + 1] = temp;
//                    pivotIndex++;
//                }
//            }
//
//        }
//    }

}
