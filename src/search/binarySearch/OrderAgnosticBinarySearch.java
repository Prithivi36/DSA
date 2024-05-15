package search.binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] sortedArr={2,4,5,7,9,11,2,16,45,98};
        int[] descArr={98,45,44,39,24,17,11,8,5,3,1};
        int answer=orderAgnosticBS(sortedArr,9);
        int descAnswer=orderAgnosticBS(descArr,3);
        System.out.println("Index is "+answer);
        System.out.println("Index in Descending Array  is "+descAnswer);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        boolean isDesc=arr[0]>arr[arr.length-1];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;}

            if(!isDesc){
                if(arr[mid]<target){
                    start=mid+1;
                } else if (arr[mid]>target) {
                    end=mid-1;
                }
            }else {
                if(arr[mid]>target){
                    start=mid+1;
                } else if (arr[mid]<target) {
                    end=mid-1;
                }
            }

        }
        return -1;
    }
}
