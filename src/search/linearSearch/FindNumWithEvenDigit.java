package search.linearSearch;

//1295. Find Numbers with Even Number of Digits
/*

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.

 */

public class FindNumWithEvenDigit {
    public static void main(String[] args) {
        int[] arr={555,901,482,1771};
        int answer=findNumbers(arr);
        System.out.println("Event digits count is " + answer);
    }
    static public int findNumbers(int[] nums) {
        int eCount=0;
        for(int i : nums){
            if(logMethod(i))
                eCount++;
        }
        return eCount;
    }

    static boolean logMethod(int num){
        if(num<0)
            num=num*-1;
        int countDigit=(int)Math.log10(num)+1;

        return countDigit%2==0;
    }

    static  public boolean findCount(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println(count);
        if(count%2==0)
            return true;
        return false;
    }
}
