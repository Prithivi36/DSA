package sort.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array={-1,0,-3};
        mergeSortinPlace(array,0, array.length);
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

    public static void mergeSortinPlace(int[] arr,int start,int end){
        if(start==end-1)
            return;
        int mid=(start+end)/2;

        mergeSortinPlace(arr,start,mid);
        mergeSortinPlace(arr,mid,end);

        mergeInPlace(arr,start,mid,end);

    }

    public static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int i=start;
        int j=mid;
        int k=0;
        int[] temp=new int[end-start];

        while(i<mid&&j<end){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            } else if (arr[j]<arr[i]) {
                temp[k++]=arr[j++];
            }
        }
        while(i<mid){
            temp[k++]=arr[i++];
        }
        while (j<end){
            temp[k++]=arr[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            arr[start+l]=temp[l];
        }

    }


}
