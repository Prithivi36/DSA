package search.binarySearch;

public class FindElementInBitonicArray {
    public static void main(String[] args) {
        int[] array={0,5,3,1};
        int[] array2={0,1,2,4,2,1};
        System.out.println(findInMA(3,array));
    }
    static int findInMA(int target, int[]arr){
        int peak=peakSearch(arr);
        int index=orderAgnosticBS(arr,target,0,peak);

        if(index==-1){
            return  orderAgnosticBS(arr,target,peak+1,arr.length-1);
        }
        return index;
    }
    static int peakSearch(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            if(arr[mid]<arr[mid+1])
                start=mid+1;
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target ,int start,int end){


        boolean isAsc=arr[start]<arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(isAsc){
                if(arr[mid]>target)
                    end=mid-1;
                else if(arr[mid]<target)
                    start=mid+1;
            }else {
                if(arr[mid]<target)
                    end=mid-1;
                else if(arr[mid]>target)
                    start=mid+1;
            }


        }

        return -1;
    }
}
