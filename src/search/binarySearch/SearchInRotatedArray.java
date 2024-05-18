package search.binarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] array={3,4,5,6,1,2};
        System.out.println(findPivot(array));
        System.out.println(search(array,2));
    }
    static public int search(int[] nums, int target) {

        int pivot=findPivot(nums);

        if(pivot!=-1){
            if(nums[0]>target)
                return binarySearch(nums,target,pivot+1,nums.length-1);
            return binarySearch(nums,target,0,pivot);
        }
        return binarySearch(nums,target,0, nums.length-1);
    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(arr.length>1 && start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]>arr[start])
                start=mid+1;
            else if(arr[mid]<=arr[start])
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
