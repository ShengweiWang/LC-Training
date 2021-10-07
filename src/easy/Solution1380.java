package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shengwei_Wang on 6/22/21.
 * v1 5:30
 */
public class Solution1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] rowMin = new int[matrix.length];
        int[] colMax = new int[matrix[0].length];
        for(int row = 0; row < matrix.length; ++row) {
            rowMin[row] = Integer.MAX_VALUE;
            for(int col = 0; col < matrix[row].length; ++col) {
                rowMin[row] = Math.min(rowMin[row], matrix[row][col]);
                colMax[col] = Math.max(colMax[col], matrix[row][col]);
            }
        }
        List<Integer> result = new LinkedList<>();
        for(int row = 0; row < matrix.length; ++row) {
            for(int col = 0; col < matrix[row].length; ++col) {
                if (matrix[row][col] == rowMin[row] && matrix[row][col] == colMax[col]){
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;
    }
}
