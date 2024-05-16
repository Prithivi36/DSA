package search.binarySearch;

import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr ={3,7,7,7,8,10,11,13,16,21};
        System.out.println("My method "+Arrays.toString(searchRange(arr,7)));
        int[] answer=new int[] {findAnswer(arr,7,true),findAnswer(arr,7,false)};
        System.out.println("Kunal's Method "+ Arrays.toString(answer));
    }
    static int binarySearch(int[] arr ,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
        }

        return -1;
    }
    static  public int[] searchRange(int[] nums, int target) {
        if(binarySearch(nums,target)!=-1)
        return new int[] {findFirst(nums, target),findLast(nums, target)};
        return new int[] {-1,-1};
    }
    static int findFirst(int[] arr ,int target){
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>=target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }
        }

        return start;
    }
    static int findLast(int[] arr ,int target){
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<=target) {
                start=mid+1;
            }
        }

        return start-1;
    }

    //Kunal's Answer

    static int findAnswer(int[] arr,int target , boolean isFirst){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }else {
                ans=mid;
                if(isFirst)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return ans;
    }
}
