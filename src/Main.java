public class Main {
    public static void main(String[] args) {

        int[] array={2,3,5,7,11,13,17,23,29,31,37};

        //index answer
        int answerIndex=linearSearch(array,7);

        //element finder
        int answerElement=linearSearch2(array,110);


        //boolen result
        boolean answerBoolean=linearSearch3(array,7);

        System.out.println(answerIndex);
        System.out.println(answerElement);
        System.out.println(answerBoolean);

    }

    static int linearSearch(int[] arr, int target){
        for(int i =01;i< arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int linearSearch2(int[] arr, int target){
        for(int val : arr){
            if(val == target){
                return val;
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean linearSearch3(int[] arr, int target){
        for(int val : arr){
            if(val == target){
                return true;
            }
        }
        return false;
    }
}