package _03_method;

/**
 * https://leetcode.com/problems/merge-sorted-array/description/
 * Thoughts:
 * 1. 拿nums2的值，去对比nums1的值，比完直接确定merge的位置，且merge
 * 2. 都从尾部开始对比
 * 3. 需要3个指针
 * 4. 特别注意：loop的停止条件，一定要是j作为结束条件
 * 5. 细节注意：
 */
public class MergedSortedArray {
    public static void main(String[] args) {

    }

    /**
     * 1. create 3 pointers: i for nums1, j for nums2, k for the exact index after merge
     * 2. i start from index m - 1 (the last valid number in nums1)
     * 3. j start from index n - 1 (the last valid number in nums2)
     * 4. k start from index m + n - 1 (the last index after merge)
     * 4. compare the value of 2 pointers (i & j).
     * 5. if nums2[j] > nums1[i], nums2[j] should be placed at the last index of nums1,
     *    which is nums1[k] = nums2[j]
     * 6. after this change, both j and k move left one index,
     *    which means j --; k --
     *    then still compare the value nums2[j] and nums1[i]
     *    if  nums2[j] > nums1[i], still nums1[k] = nums2[j], then j --, k --;
     * 7. if nums1[i] > nums2[j], nums1[k] = nums1[i],  then i --, k --
     * 8. if nums1[i] = nums2[j], nums1[k] = nums2[j], then j --, k --
     * 9. when j < 0, compare stop.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // three pointers
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j] ) {
                nums1[k--] = nums1[i--];
            }else {
                nums1[k--] = nums2[j--];
            }
        }

    }
}
