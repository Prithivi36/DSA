package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array={-1,0,-3};
        array=mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    static public int[] mergeSort(int[] arr){
        int start=0;
        int end=arr.length;
        int mid=start+end/2;
        if(arr.length==1)
            return arr;

        int[] left=mergeSort(Arrays.copyOfRange(arr,start,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static public int[] merge(int[] first, int[] second){
        int i=0;
        int j=0;
        int k=0;
        int[] ans=new int[first.length+second.length];
        while(i<first.length&&j<second.length){
            if(first[i]<second[j]){
                ans[k]=first[i];
                i++;
            }
            else if(first[i]>second[j]){
                ans[k]=second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            ans[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            ans[k]=second[j];
            j++;
            k++;

        }

        return ans;
    }
}
