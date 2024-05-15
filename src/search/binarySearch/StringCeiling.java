package search.binarySearch;

public class StringCeiling {
    public static void main(String[] args) {

    }
    static int stringCeiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        if(target>arr[arr.length-1])
            return 0;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid+1;
            }
            if(arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
        }
        return start;
    }
}
