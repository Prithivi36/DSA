package search.binarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] array={1};
        System.out.println(search(array,0));
    }
    static public int search(int[] nums, int target) {
        int pivot=0;
        if(nums.length>1){
        pivot=findPivot(nums);
        }
        if(nums.length>1){
            if(nums[0]>target)
                return binarySearch(nums,target,pivot+1,nums.length-1);
        }
        return binarySearch(nums,target,0,pivot);
    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]>start)
                start=mid;
            if(arr[mid]<start)
                end=mid-1;

        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target)
                end=mid-1;
            if(arr[mid]<target)
                start=mid+1;

        }
        return -1;
    }
}
