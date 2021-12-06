package templates;

/**
 * Created by Shengwei_Wang on 9/26/21.
 */
public class QuickSelect {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] nums, int l, int r, int k) {
        if (l == r) {
            return nums[l];
        }
        int pivot = l + (r - l) / 2;
        pivot = partition(nums, l, r, pivot);
        if(pivot == k) {
            return nums[k];
        } else if (pivot < k) {
            return quickSelect(nums, pivot + 1, r, k);
        } else {
            return quickSelect(nums, l, pivot - 1, k);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int partition(int[] nums, int l, int r, int k) {
        swap(nums, k, r);
        int store = l;
        for(int i = l; i < r; ++i) {
            if (nums[i] < nums[r]) {
                swap(nums, i, store);
                ++store;
            }
        }
        swap(nums, store, r);
        return store;
    }
}
