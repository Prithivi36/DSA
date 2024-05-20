package search.binarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int [] array={7,2,5,10,8};
        System.out.println(Split(array,2));
    }
    static public int Split(int[] arr,int m){
        int start=Integer.MIN_VALUE;
        int end=0;
        for(int num :arr){
            start=Integer.max(start,num);
            end+=num;
        }
        while (start<end){
            int mid=start+(end-start)/2;
            int limit=0;
            int pieces=1;

            for(int num :arr){
                if(limit+num>mid){
                    limit=num;
                    pieces++;
                }else {
                    limit+=num;
                }
            }
            if(pieces<=m){
                end=mid;
            }else {
                start=mid+1;
            }
        }

        return end;
    }
}
