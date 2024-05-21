package sort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] array={3,2,1,4,5,9,6,7,8};
        cyclicSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void cyclicSort(int[] arr){
        int i=0;
        while (i <arr.length){
            if(arr[i]-1==i){
                i++;
            }else {
                swap(arr,i,arr[i]-1);
            }
        }
    }
    static void swap(int[] arr ,int e1,int e2){
        int temp=arr[e1];
        arr[e1]=arr[e2];
        arr[e2]=temp;
    }
}
