package DataStructure.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public List<List<Integer>> levelOrder(BinaryTree.Node root) {

        List<List<Integer>> ans= new ArrayList<>();

        if(root==null) return ans;

        Queue<BinaryTree.Node> que= new LinkedList<>();
        que.offer(root);

        while(!que.isEmpty()){
            int elements=que.size();

            List<Integer> levelAns= new ArrayList<>();

            for(int i =0 ; i<elements ; i++){
                BinaryTree.Node current=que.poll();
                levelAns.add(current.value);
                if(current.left!=null) que.add(current.left);
                if(current.right!=null) que.add(current.right);
            }
            ans.add(levelAns);
        }

        return ans;


    }
}
