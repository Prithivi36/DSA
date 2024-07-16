package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array={7,4,2,0,-150,-2,9,1};
        bubbleSort(array,array.length,0);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] arr,int r,int c){
        if(r==0) {
            return;
        }
        if(r-1>c){
            if(arr[c]>arr[c+1]){
              int temp=arr[c];
              arr[c]=arr[c+1];
              arr[c+1]=temp;
            }
            bubbleSort(arr,r,c+1);
        }else {
            bubbleSort(arr,r-1,0);
        }
    }
}
