package Practice;

public class TowerOfHanoi {
    public static void main(String[] args){
        towerOfHanoi(4,'A','B','C');
    }
    public static void towerOfHanoi(int n, char from,char via,char to){
        if(n==0) return;
        towerOfHanoi(n-1,from,to,via);
        System.out.println(from +" -> "+ to);
        towerOfHanoi(n-1,via,from,to);
    }
}
