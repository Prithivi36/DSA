package sort.CyclicSort;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array={3,0,1};
        cyclicSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(findMissingNumber(array));
    }
    static int findMissingNumber(int[] arr){
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }
    static void cyclicSort(int[] arr){
        int i=0;
        while (i <arr.length){
            if(arr[i]==i){
                i++;
            } else if (arr[i]>=arr.length) {
                i++;
            } else {
                swap(arr,i,arr[i]);
            }
        }
    }
    static void swap(int[] arr ,int e1,int e2){
        int temp=arr[e1];
        arr[e1]=arr[e2];
        arr[e2]=temp;
    }
}
