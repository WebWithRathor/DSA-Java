package Tree;

import java.util.*;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;
    static int i = 0;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }

    static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    private static TreeNode buildTree(int arr[]) {
        // input lene k liya of data
        int value = arr[i++];
        if (value == -1) {
            return null;
        }
        // root node creation
        TreeNode root = new TreeNode(value);
        // left node k liya data
        root.left = buildTree(arr);
        // right node k liya data
        root.right = buildTree(arr);
        return root;
    }

    private static void inOrder(TreeNode head) {
        if (head == null) return;
        inOrder(head.left);
        System.out.print(head.data + " , ");
        inOrder(head.right);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root == null) return list;
        int size = 0;
        int count =0;
        que.offer(root);
        while (!que.isEmpty()) {
            ArrayList<Integer> arr = new ArrayList<>();
            size = que.size();
            while (size-- > 0) {
                TreeNode currentNode = que.poll();
                if (currentNode.left != null)
                    que.offer(currentNode.left);
                if (currentNode.right != null)
                    que.offer(currentNode.right);
                arr.add(currentNode.data);
            }
            list.add(arr);
            System.out.println(que);
        }
        return list;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1, -1, 1,-1,-1, 4, 5, -1, 6, -1, -1, -1};
        TreeNode head = buildTree(arr);
        System.out.println((levelOrder(head)));
        inOrder(head);
    }


}
