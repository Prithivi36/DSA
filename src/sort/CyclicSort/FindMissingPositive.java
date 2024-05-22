package sort.CyclicSort;

import java.util.Arrays;

public class FindMissingPositive {
    public static void main(String[] args) {
        int[] arr={3,7,-1,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]>0&& arr[i]<=arr.length &&arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);

            }else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int end){
        int temp=arr[end];
        arr[end]=arr[first];
        arr[first]=temp;
    }
}
