package templates;

/**
 * Created by Shengwei_Wang on 10/17/21.
 */
public class SegmentTree {
         private class Node {
         int l, r, sum;
         Node left, right;
         public Node(int l, int r, Node left, Node right, int sum) {
             this.l = l;
             this.r = r;
             this.left = left;
             this.right = right;
             this.sum = sum;
         }
     }

     private Node root;
     private int[] nums;

     public NumArray(int[] nums) {
         this.nums = nums;
         // build up tree
         Queue<Node> pendingNode = new LinkedList<>();
         for(int i = 0; i < nums.length; ++i) {
             pendingNode.offer(new Node(i, i, null, null, nums[i]));
         }
         while(pendingNode.size() > 1) {
             Queue<Node> nextNodes = new LinkedList<>();
             while(!pendingNode.isEmpty()) {
                 Node cl = pendingNode.poll();
                 Node cr = pendingNode.poll();
                 if(cr != null) {
                     nextNodes.offer(new Node(cl.l, cr.r, cl, cr, cl.sum + cr.sum));
                 } else {
                     nextNodes.offer(cl);
                 }

             }
             pendingNode = nextNodes;
         }
         this.root = pendingNode.poll();

     }

     private void pre(Node root) {
         if(root == null) {
             return;
         }
         System.out.println(root.l + " " + root.r + " " + root.sum);
         pre(root.left);
         pre(root.right);


     }

     public void update(int index, int val) {
         updateTree(root, index, val - nums[index]);
         nums[index] = val;
     }

     public int sumRange(int left, int right) {
         return query(root, left, right);
     }

     private int query(Node root, int l, int r) {
         if (root.l == l && root.r == r) {
             return root.sum;
         } else {
             int res = 0;
             if(root.left != null && l <= root.left.r ) {
                 res += query(root.left, l, Math.min(root.left.r, r));
             }
             if(root.right != null && root.right.l <= r) {
                 res += query(root.right, Math.max(l, root.right.l), r);
             }
             return res;
         }
     }

     private void updateTree(Node root, int i, int data) {
         root.sum += data;
         if(root.left != null && i <= root.left.r) {
             updateTree(root.left, i, data);
         } else if (root.right != null && root.right.l <= i){
             updateTree(root.right, i, data);
         }
     }
}
