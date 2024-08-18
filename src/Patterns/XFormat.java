package Patterns;

//Zoho Interview Questions

public class XFormat {
    public static void main(String[] args) {
        String word="12345";
        printPattern(word);
    }
    public static void printPattern(String words){
        int start=0;
        int end=words.length()-1;
        char[] array=words.toCharArray();
        for(int i=0;i<words.length();i++){
            for(int j=0;j<words.length();j++){
                if(start==j||end==j){
                    System.out.print(array[j]);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            start++;
            end--;
        }
    }
}
