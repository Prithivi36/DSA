package sort.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] array={5,3,4,1,5,2,1,6};
        List<Integer> answer=cyclicSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(answer);
    }

    static List<Integer> cyclicSort(int[] arr){
        List<Integer> answer=new ArrayList<>();
        int i=0;
        while(i<arr.length){
                if(arr[i]!=arr[arr[i]-1]){
                    swap(arr,i,arr[i]-1);

                }else {
                    i++;
                }
        }
        for (i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                answer.add(arr[i] );
            }
        }
        return answer;
    }
    static void swap(int[] arr, int first, int end){
        int temp=arr[end];
        arr[end]=arr[first];
        arr[first]=temp;
    }
}

