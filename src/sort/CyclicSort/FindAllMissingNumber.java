package sort.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMissingNumber {
    public static void main(String[] args) {
        int[] array={4,3,2,2,3,1};
//        cyclicSort(array);
        System.out.println(findDisappearedNumbers(array));
        System.out.println(Arrays.toString(array));
    }

    static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }else {
                i++;
            }
        }
    }
    static public List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        List<Integer> answer=new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=i+1){
                answer.add(i+1);
            }
        }
        return answer;
    }
    static void swap(int[] arr ,int e1,int e2){
        int temp=arr[e1];
        arr[e1]=arr[e2];
        arr[e2]=temp;
    }
}
