package search.binarySearch;

import java.util.Arrays;

public class CountRotationsInArray {
    public static void main(String[] args) {
        int[] arr = { 2,2,9,2};
        int pivot=findPivot(arr);
        int leftCount=pivot+1;
        System.out.println(findPivot(arr));
    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(arr.length>1&&start<=end){
            int mid= start+(end-start)/2;

            if(mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            } else if (mid>start&&arr[mid]<arr[mid-1]) {
                return mid-1;
            }else {
                if(arr[start]>arr[start+1])
                    return start;
                else if (arr[end]<arr[end-1]) {
                    return end-1;
                }
                start++;
                end--;
            }

        }
        return -1;
    }
}
