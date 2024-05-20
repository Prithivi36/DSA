package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array={2,5,3,2,-35};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void insertionSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr ,int e1,int e2){
        int temp=arr[e1];
        arr[e1]=arr[e2];
        arr[e2]=temp;
    }
}
