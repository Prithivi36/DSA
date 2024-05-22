package sort.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] array={1,2,2,4};
        int[] answer=cyclicSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(answer));
    }
    static int[] cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);

            }else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                return new int[]{arr[i],i+1};
            }
        }
        return new int[]{};
    }
    static void swap(int[] arr, int first, int end){
        int temp=arr[end];
        arr[end]=arr[first];
        arr[first]=temp;
    }
}
