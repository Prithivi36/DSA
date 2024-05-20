package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array={1,23};
        bubbleSort(array);

        System.out.println(Arrays.toString(array));

    }
    static void bubbleSort(int[] arr){
        boolean isSwapped=false;
        for(int i=0;i<arr.length;i++){
            for(int j =1 ; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped)
                break;
        }
    }
}
