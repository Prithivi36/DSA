package search.binarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] sortedArr={2,4,5,7,9,11,12,16,45,98,120};
        int answer=floorSearch(sortedArr,13);
        System.out.println("Index is "+answer);
    }
    static int floorSearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
        }
        return end;
    }
}
