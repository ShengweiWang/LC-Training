package easy;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 3:45
 */
public class Solution1469 {
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        } else {
            if (root.left != null) {
                if (root.right == null) {
                    result.add(root.left.val);
                }
                result.addAll(getLonelyNodes(root.left));
            }
            if (root.right != null) {
                if (root.left == null) {
                    result.add(root.right.val);
                }
                result.addAll(getLonelyNodes(root.right));
            }
        }
        return result;
    }
}
