package DataStructure.SinglyLL;

public class HappyNumber {
    public static void main(String[] args) {


        System.out.println(isHappyNumber(19));

    }
    public static boolean isHappyNumber(int number){
        int fastPointer=number;
        int slowPointer=number;

        do{
            slowPointer=findSquareOfDigit(slowPointer);
            fastPointer=findSquareOfDigit(findSquareOfDigit(fastPointer));
        }while(slowPointer!=fastPointer);

        return slowPointer==1;
    }
    public static int findSquareOfDigit(int num){
        int digit;
        int answer=0;

        while(num!=0){
            digit=num%10;
            answer=(int)(answer+Math.pow(digit,2));
            num=num/10;
        }

        return answer;
    }
}
