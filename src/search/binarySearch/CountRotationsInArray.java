package search.binarySearch;

import java.util.Arrays;

public class CountRotationsInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int pivot=findPivot(arr);
        int leftCount=pivot+1;
        System.out.println("p :" +pivot);
        System.out.println("l :"+arr.length);
    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        int steps=0;
        while(arr.length>1&&start<=end){
            steps++;
            int mid= start+(end-start)/2;

            if(mid<end&&arr[mid]>arr[mid+1]){
                System.out.println("s :"+steps);
                return mid;
            } else if (mid>start&&arr[mid]<arr[mid-1]) {
                System.out.println("s :"+steps);
                return mid-1;
            }
            if (arr[start]>arr[mid]){
                end=mid-1;
            } else if (arr[start]<arr[mid]) {
                start=mid+1;
            } else{
                if(mid<end&&arr[start]>arr[start+1]) {
                    System.out.println("s :" + steps);
                    return start;
                }
                else if (mid>start&&arr[end]<arr[end-1]) {
                    System.out.println("s :"+steps);
                    return end-1;

                }
                start++;
                end--;
            }

        }
        System.out.println("s :"+steps);
        return -1;
    }
}
