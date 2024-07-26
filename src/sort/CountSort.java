package sort;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] array={7,6,2,4,8,3,4,8,6,4,7,8,6,1,3,5,7,9,6,4,2,5};
        countSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void countSort(int[] arr){
        int max=0;
        for(int num : arr){
            if(num>max){
                max=num;
            }
        }
        int[] freq=new int[max+1];

        for(int num: arr){
            freq[num]=freq[num]+1;
        }
        int counter=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                if(freq[i]>0){
                    arr[counter]=i;
                    counter++;
                    freq[i]=freq[i]-1;
                }
            }
        }
    }
}