package Tree.Views;

import Tree.TreeNode;

import java.util.*;

public class BFS {
    ArrayList<Integer> rightView(TreeNode root) {
        // add code here.
        ArrayList<Integer> right = new ArrayList<>();
        if (root == null) return right;
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 1;
        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- > 0) {
                TreeNode currentTreeNode = q.poll();
                if (currentTreeNode.left != null) q.offer(currentTreeNode.left);
                if (currentTreeNode.right != null) q.offer(currentTreeNode.right);
                map.put(level, currentTreeNode.data);

            }
            level++;
        }
        right.addAll(map.values());
        return right;
    }

    ArrayList<Integer> leftView(TreeNode root) {
        // code here
        ArrayList<Integer> left = new ArrayList<>();
        if(root == null) return left;
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();


        q.offer(root);


        int level = 1;
        while(!q.isEmpty()){
            int size = q.size();

            while(size -- > 0){
                TreeNode currentNode = q.poll();
                if(currentNode.left != null)q.offer(currentNode.left);
                if(currentNode.right != null)q.offer(currentNode.right);
                if(!map.containsKey(level)){
                    map.put(level,currentNode.data);
                    left.add(currentNode.data);
                }
            }
            level++;

        }

        return left;

    }

    ArrayList<Integer> bottomView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> hdq = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        if(root == null) return list;
        q.offer(root);
        hdq.offer(0);
        map.put(0,root.data);

        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                TreeNode cur = q.poll();
                int curHd = hdq.poll();
                if(cur.left != null){
                    q.offer(cur.left);
                    hdq.offer(curHd -1 );
                }
                if(cur.right != null){
                    q.offer(cur.right);
                    hdq.offer(curHd +1 );
                }
                map.put(curHd,cur.data);

            }
        }
        list.addAll(map.values());
        return list;
    }

    ArrayList<Integer> topView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> hdq = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        if(root == null) return list;
        q.offer(root);
        hdq.offer(0);
        map.put(0,root.data);

        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                TreeNode cur = q.poll();
                int curHd = hdq.poll();
                if(cur.left != null){
                    q.offer(cur.left);
                    hdq.offer(curHd -1 );
                }
                if(cur.right != null){
                    q.offer(cur.right);
                    hdq.offer(curHd +1 );
                }
                if(!map.containsKey(curHd))map.put(curHd,cur.data);

            }
        }
        list.addAll(map.values());
        return list;
    }

}
