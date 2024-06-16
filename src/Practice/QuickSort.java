package Practice;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={7,5,6,1,39,45,27};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int left,int right){

        if(left>=right){
            return;
        }

        int start=left;
        int end=right;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];

        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }

            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        quickSort(arr,left,end);
        quickSort(arr,start,right);

    }
}
