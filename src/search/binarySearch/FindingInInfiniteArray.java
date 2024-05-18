package search.binarySearch;

public class FindingInInfiniteArray {
    public static void main(String[] args) {
        int[] array={1,2,5,6,7,9,11,15,18,21,24,29,34,56,67,88,99,102,150,164,167,198,199,245,347,379,456,459,478,489,564,567,568,569};
        System.out.println(findInInfinity(array,150));
    }
    static int findInInfinity(int[] arr , int target){
        int start=0;
        int end=1;

        while (arr[end]<target) {
            int temp = end + 1;
            end=end+((end-start+1)*2);
            start=temp;
        }

        return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int[] arr , int target , int start ,int end){


        while (start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                end=mid-1;
            else if(arr[mid]<target)
                start=mid+1;
        }

        return -1;
    }
}
