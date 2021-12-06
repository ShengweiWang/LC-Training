package templates;

/**
 * Created by Shengwei_Wang on 9/26/21.
 */
public class BinarySearch {
    public int findLessOrEqual(int[] a, int t) {
        return findFirstGreat(a, t) - 1;
    }

    public int findFirstLess(int[] a, int t) {
        int l = 0;
        int r = a.length;
        while(l < r) {
            int mid = l + (r - l + 1) / 2;
            if (a[mid] < t) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    public int findFirstGreat(int[] a, int t) {
        int l = 0;
        int r = a.length;
        while(l < r) {
            int mid = l + (r - l) / 2;
            if (a[mid] <= t) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
    public int findFirstGreatOrEqual(int[] a, int t) {
        int l = 0;
        int r = a.length;
        while(l < r) {
            int mid = l + (r - l) / 2;
            if (a[mid] < t) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    public int[] searchRange(int[] nums, int target) {
        int l = firstLargerOrEqual(nums, target);
        if (l == nums.length || nums[l] != target) {
            return new int[] {-1, -1};
        } else {
            int r = firstLargerOrEqual(nums, target + 1);
            return new int[] {l, r - 1};
        }
    }

    private int firstLargerOrEqual(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while(l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
