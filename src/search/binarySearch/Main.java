package search.binarySearch;

public class Main {
    public static void main(String[] args) {
        int[] sortedArr={2,4,5,7,9,11,2,16,45,98};
        int[] bigArr=new int[100000000];
        int answer=binarySearch(sortedArr,9);
        System.out.println("Index is "+answer);
        binarySearchCount(bigArr,10);

    }
    static int binarySearch(int[] arr ,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //this may exceed int range when large values are added
//            int mid=(start+end)/2;
//            int notWay=(Integer.MAX_VALUE+50)/2;
//            System.out.println(notWay);   //answer -1073741799
//            int rightWay=Integer.MAX_VALUE+(50-Integer.MAX_VALUE)/2;
//            System.out.println(rightWay);  //answer -1073741849

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
    static int binarySearchCount(int[] arr ,int target){
        int start=0;
        int end=arr.length-1;
        int count=0;
        while(start<=end){
            count++;
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println("steps "+count);
                return mid;}
            if(arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
        }
        System.out.println("steps "+count);

        return -1;
    }
}
