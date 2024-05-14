package search.linearSearch;

public class Main {
    public static void main(String[] args) {

        int[] array={91,29,11,17,23,2,3,13,5,7,31,37};

        //index answer
        int answerIndex=linearSearch(array,7);

        //element finder
        int answerElement=linearSearch2(array,110);


        //boolen result
        boolean answerBoolean=linearSearch3(array,7);

        System.out.println("Index answer "+answerIndex);
        System.out.println("Element answer " +answerElement);
        System.out.println("Boolean answer "+answerBoolean);

    }

    static int linearSearch(int[] arr, int target){
        if(arr.length==0)
            return -1;

        for(int i =01;i< arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int linearSearch2(int[] arr, int target){
        if(arr.length==0)
            return Integer.MAX_VALUE;

        for(int val : arr){
            if(val == target){
                return val;
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean linearSearch3(int[] arr, int target){
        if(arr.length==0)
            return false;

        for(int val : arr){
            if(val == target){
                return true;
            }
        }
        return false;
    }
}