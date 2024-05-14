package search.linearSearch;

import java.util.Arrays;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int[][] array2d={
                {5,7,8,6,3,4,1},
                {10,11,87,56},
                {14,67,23}
        };
        int[] answerIndex=linearSearch(array2d,67);
        int answer=array2d[answerIndex[0]][answerIndex[1]];
        int maxNum=findMaxNumber(array2d);

        System.out.println("index value " + Arrays.toString(answerIndex));
        System.out.println("answer " + answer);
        System.out.println("is present " + linearSearch2(array2d,87));
        System.out.println("Maximum Value "+ maxNum);
    }

    static int findMaxNumber(int[][] arr ){
        int maxVal=Integer.MIN_VALUE;
        for(int[] i : arr){
            for(int j : i){
                if(j>maxVal)
                    maxVal=j;
            }
        }
        return maxVal;
    }

    static int[] linearSearch(int[][] array ,int target){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{};
    }

    static boolean linearSearch2(int[][] array ,int target){
        for(int[] arr : array){
            for(int num :arr){
                if(num==target)
                    return true;
            }
        }
        return false;
    }
}
