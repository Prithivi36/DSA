package search.binarySearch;

public class StringCeiling {
    public static void main(String[] args) {
        char[] arr={'e','e','g','g'};
        char answer=stringCeiling(arr,'g');
        System.out.println(answer);
    }
    static char stringCeiling(char[] arr, char target){
        int start=0;
        int end=arr.length-1;

        if(target>arr[arr.length-1])
            return arr[0];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
        }
        if(start>arr.length-1){
            return arr[0];
        }
        return arr[start];
    }

}
