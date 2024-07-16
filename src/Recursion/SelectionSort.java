package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array={7,4,2,9,1};
        selectionSort(array,array.length,0,0);
        System.out.println(Arrays.toString(array));
    }
    public static void selectionSort(int[] arr,int r,int c,int max){
        if(r==0) {
            return;
        }
        if(r-1>c){
            if(arr[c+1]>arr[max]){
                selectionSort(arr,r,c+1,c+1);
            }else {
                selectionSort(arr,r,c+1,max);
            }
        }else {
            int temp=arr[c];
            arr[c]=arr[max];
            arr[max]=temp;
            selectionSort(arr,r-1,0,0);
        }
    }
}
