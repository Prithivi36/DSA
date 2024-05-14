package search.linearSearch;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int[][] array2d={
                {5,7,8,6,3,4,1},
                {10,11,87,56},
                {14,67,23}
        };
        int[] answerIndex=linearSearch(array2d,11);
        int answer=array2d[answerIndex[0]][answerIndex[1]];

        System.out.println("index value " + answerIndex);
        System.out.println("answer " + answer);
        System.out.println("is present " + linearSearch2(array2d,87));
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
