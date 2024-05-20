package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array={1,3,6,3,2,8,75};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void selectionSort(int[] arr ){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-1-i;
            int max=getMax(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getMax(int[] arr, int start, int end){
        int maxIndex=start;
        for(int i =start;i<=end;i++){
            if(arr[maxIndex]<arr[i]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    static void swap(int[] arr ,int e1,int e2){
        int temp=arr[e1];
        arr[e1]=arr[e2];
        arr[e2]=temp;
    }
}
