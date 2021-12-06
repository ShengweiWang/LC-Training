package templates;

/**
 * Created by Shengwei_Wang on 10/17/21.
 */
public class fenwickTree {
    int[] bit, nums; // 1 - index-based
    int n;
    public NumArray(int[] nums) {
        this.n = nums.length;
        this.nums = new int[n + 1];
        this.bit = new int[n + 1];
        buildTree(nums);
    }
    private void buildTree(int[] nums) {
        for(int i = 0; i < n; ++i) {
            update(i, nums[i]);
        }
    }

    // this index is 0-based
    public void update(int index, int val) {
        index++;
        int delta = val - nums[index];
        nums[index] = val;
        while(index <= n) {
            bit[index] += delta;
            index += lsb(index);
        }
    }

    public int sumRange(int l, int r) {
        return sumRange(r) - sumRange(l - 1);
    }

    // 0 - based
    private int sumRange(int l) {
        ++l;
        int sum = 0;
        while(l > 0) {
            sum += bit[l];
            l -= lsb(l);
        }
        return sum;
    }

    private int lsb (int i) {
        return i & (-i);
    }

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * obj.update(row,col,val);
 * int param_2 = obj.sumRegion(row1,col1,row2,col2);
 */
}



class NumMatrix {
    int[][] matrix, bit;
    int m, n;

    public NumMatrix(int[][] matrix) {
        this.m = matrix.length;
        this.n = matrix[0].length;
        this.matrix = new int[m + 1][n + 1];
        this.bit = new int[m + 1][n + 1];
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                update(i, j, matrix[i][j]);
            }
        }
    }

    public void update(int row, int col, int val) {
        int delta = val - matrix[row + 1][col + 1];
        matrix[row + 1][col + 1] = val;
        for(int i = row + 1; i <= m; i += lsb(i)) {
            for(int j = col + 1; j <= n; j += lsb(j)) {
                bit[i][j] += delta;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sumRegion(row2, col2) - sumRegion(row2, col1 -1) - sumRegion(row1 - 1, col2) + sumRegion(row1 - 1, col1 - 1);
    }

    private int sumRegion(int row, int col) {
        int sum = 0;
        for(int i = row + 1; i > 0; i -= lsb(i)) {
            for(int j = col + 1; j > 0; j -= lsb(j)) {
                sum += bit[i][j];
            }
        }
        return sum;
    }
    private int lsb(int i) {
        return i & (-i);
    }
}


bit[1] = nums[1]
bit[2] = nums[1] + nums[2]
bit[3] = nums[3]
bit[4] = nums[1] + nums[2] + nums[3] + nums[4]
bit[5] = nums[5]
bit[6] = nums[5] + nums[6]
bit[7] = nums[7]
bit[8] = nums[1] + nums[2] + nums[3] + nums[4] + nums[5] + nums[6] + nums[7] + nums[8]