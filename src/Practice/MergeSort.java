package Practice;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array={5,7,3,1,8,2};
        mergeSort(array,0,array.length);
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int[] arr, int start,int end){
        int mid=start+(end-start)/2;
        if(end-start==1)
            return;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int[] arr,int start,int mid,int end){
        int i=start;
        int j =mid;
        int k=0;
        int[] answer=new int[end-start];
        while(i<mid && j<end ){
            if(arr[i]<arr[j]){
                answer[k]=arr[i];
                i++;
                k++;
            }else if(arr[j]<arr[i]){
                answer[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<mid){
            answer[k++]=arr[i++];
        }
        while(j<end){
            answer[k++]=arr[j++];
        }
        for (int ans : answer){
            arr[start++]=ans;
        }
    }
}
