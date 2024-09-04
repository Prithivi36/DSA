package Practice.LeetCode;

import java.util.Arrays;

public class RobotSum {
    public static void main(String[] args) {
//        System.out.println(findDirection('e',-2));
//        int[] c={3,5};
//        int[] n={3,2};
//        int[][] o={{3,4},{6,4}};
//        System.out.println(Arrays.toString(canPass(c,n,o)));
    int[] a={4,-1,4,-2,4};
    int[][] b={{2,4}};
        System.out.println((robotSim(a,b)));
    }
    public static int eucDis(int[] pos){
        return (pos[0]*pos[0])+(pos[1]*pos[1]);
    }
    public static int robotSim(int[] commands, int[][] obstacles) {
        char direction = 'n';
        int[] pos={0,0};
        int ans=0;
        for(int i : commands){
            int[] target=new int[2];
            if(i==-1||i==-2){
                direction=findDirection(direction,i);
                continue;
            }
            if(direction=='n'){
                target=new int[]{pos[0],pos[1]+i};
            }else if(direction=='e'){
                target=new int[]{pos[0]+i,pos[1]};
            }else if(direction=='w'){
                target=new int[]{pos[0]-i,pos[1]};
            }else if(direction=='s'){
                target=new int[]{pos[0],pos[1]-i};
            }
            pos=canPass(pos,target,obstacles);
            int dis=eucDis(pos);
            if(dis>ans){
                ans=dis;
            }

        }
        return ans;
    }
    public static int[] canPass(int[] current,int[] next,int[][] obs){
        int[] ans={next[0],next[1]};
        for(int[] ob :obs){
            if(ob[1]==current[1] && ob[0] > current[0] && ob[0]<=next[0]){
                ans[0]=ob[0]-1;
                return ans;
            }if(ob[1]==current[1] && ob[0] < current[0] && ob[0]>=next[0]){
                ans[0]=ob[0]+1;
                return ans;
            }if(ob[0]==current[0] && ob[1] < current[1] && ob[1]>=next[1]){
                ans[1]=ob[1]+1;
                return ans;
            }if(ob[0]==current[0] && ob[1] > current[1] && ob[1]<=next[1]){
                ans[1]=ob[1]-1;
                return ans;
            }
        }
        return ans;
    }
    public static char findDirection(char cd,int ins){
        if(cd=='n'&&ins==-1){
            return 'e';
        }if(cd == 'n' && ins==-2){
            return 'w';
        }if(cd == 'e' && ins==-1){
            return 's';
        }if(cd == 'e' && ins==-2){
            return 'n';
        }if(cd == 'w' && ins==-1){
            return 'n';
        }if(cd == 'w' && ins==-2){
            return 's';
        }if(cd == 's' && ins==-1){
            return 'w';
        }if(cd == 's' && ins==-2){
            return 'e';
        }
        return ' ';
    }
}
