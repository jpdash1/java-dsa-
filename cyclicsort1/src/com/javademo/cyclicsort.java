package com.javademo;

import java.util.Arrays;

public class cyclicsort
{
    public static void main(String[] args) {
       int[] arr ={3,5,4,1,2};
       cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void cyclicSort(int[] arr)
     {
         int i = 0;
         while(i<arr.length){
             int correct = arr[i]-1;
             if(arr[i]!=arr[correct]){
                 swap(arr,i,correct);
             }else{
                 i++;
             }
         }
     }

     static void swap(int[] arr, int first, int second)
     {
         int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;
       }
}
