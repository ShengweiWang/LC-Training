package templates;

/**
 * Created by Shengwei_Wang on 8/1/21.
 */
public class dfs {
    public int[] constructDistancedSequence(int n) {
        int[] ans = new int[n * 2 - 1];
        boolean[] visited = new boolean[n + 1];

        dfs(n, visited, ans);
        return ans;
    }

    private boolean dfs(int n, boolean[] visited, int[] ans) {
        // valid edge check
        boolean valid;
        if (valid) {
            return status;
        }

        int i = 0;
        while(i < ans.length && ans[i] != 0) {
            ++i;
        }
        if (i == ans.length) {
            return true;
        }
        for (int j = n; j >=1; --j) {
            if (visited[j] || (j > 1 && (i + j >= ans.length || ans[i + j] != 0))) {
                continue;
            }
            ans[i] = j;
            if (j > 1) {
                ans[i + j] = j;
            }
            visited[j] = true;
            if (dfs(n, visited, ans)) {
                return true;
            } else {
                ans[i] = 0;
                if (j > 1) {
                    ans[i + j] = 0;
                }
                visited[j] = false;
            }
        }
        return false;
    }
}
