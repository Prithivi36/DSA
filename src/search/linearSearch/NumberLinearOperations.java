package search.linearSearch;

public class NumberLinearOperations {
    public static void main(String[] args) {

        int[] array={91,29,11,17,23,2,3,13,5,7,31,37};
        int answerRanged=findInRange(array , 2,4,23);
        int minValue=findMin(array);
        int minValueIndex=findMin2(array);

        System.out.println("Ranged answer "+answerRanged);
        System.out.println("Minimum Value "+minValue);
        System.out.println("Minimum Value Index "+minValueIndex);

    }
    static int findInRange(int[] array, int startIndex,int endIndex, int target) {
        for(int i=startIndex; i<=endIndex; i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int findMin(int[] array) {
        int min=Integer.MAX_VALUE;
        for(int i : array){
            if(min>i){
                min=i;
            }
        }
        return min;
    }
    static int findMin2(int[] array) {
        int min=0;
        for(int i =0;i<array.length;i++){
            if(array[min]>array[i]){
                min=i;
            }
        }
        return min;
    }
}
