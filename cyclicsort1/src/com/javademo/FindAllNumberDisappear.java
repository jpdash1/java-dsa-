package com.javademo;

import java.util.*;
public class FindAllNumberDisappear
{
        public static void main(String[] args) {
            int[] arr = {4,3,2,7,8,2,3,1};
            System.out.println(missingNumber(arr));
        }

        public static int missingNumber(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int correct = arr[i]-1;
                if (arr[i]<=arr.length && arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    i++;
                }
            }


            for (int index = 0; index < arr.length; index++) {
                if(arr[index]!= index +1) {
                    System.out.println( index + 1);
                }

            }

            // case 2
            return arr.length;
        }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
