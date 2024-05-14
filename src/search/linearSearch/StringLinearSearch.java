package search.linearSearch;

public class StringLinearSearch {
    public static void main(String[] args) {

        String textValue="Prithivi";
        System.out.println(stringLinearSearch(textValue,'i'));
        System.out.println(stringLinearSearch2(textValue,'a'));
    }

    static boolean stringLinearSearch(String from, char target) {

        if (from.length() == 0)
            return false;

        for(int i=0 ; i<from.length();i++){
            if(from.charAt(i)==target)
                return true;
        }
        return false;
    }

    static boolean stringLinearSearch2(String from, char target) {

        if(from.isEmpty())
            return false;

        for(char i : from.toCharArray()){
            if(target==i)
                return true;
        }
        return false;
    }
}
