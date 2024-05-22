package sort.CyclicSort;

import java.util.Arrays;

public class FindTheDuplicate {
    public static void main(String[] args) {
        int[] array={1,3,1,2,4};
        int answer=cyclicSort2(array);
        System.out.println(Arrays.toString(array));
        System.out.println(answer);
    }
    static int cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }else {
                i++;
            }
        }

        return arr[arr.length-1];
    }
    static int cyclicSort2(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                if(arr[i]!=arr[arr[i]-1]){
                    swap(arr,i,arr[i]-1);
                }else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr ,int e1,int e2){
        int temp=arr[e1];
        arr[e1]=arr[e2];
        arr[e2]=temp;
    }
}
