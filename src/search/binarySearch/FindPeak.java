package search.binarySearch;

public class FindPeak {
    public static void main(String[] args) {
        int[] array={0,1,2,3,5,9,2,1};
        System.out.println(peakSearch(array));
    }
    static int peakSearch(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid-1]<arr[mid]&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            if(arr[mid]<arr[mid+1])
                start=mid+1;
        }
        return -1;
    }
}
