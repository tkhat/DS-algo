package mergeSortedArray;

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int f = m - 1;
        int s = n - 1;
        for (int j = nums1.length - 1; j >= 0; j--) {
            if (f >= 0 && s >= 0) {
                if (nums1[f] > nums2[s]) {
                    nums1[j] = nums1[f];
                    f--;
                } else if (nums1[f] < nums2[s]) {
                    nums1[j] = nums1[s];
                    s--;
                } else {
                    nums1[j] = nums1[s];
                    s--;
                }
            } else {
                if (f < 0 && s >= 0) {
                    nums1[j] = nums1[s];
                    s--;
                } else if (f >= 0) {
                    nums1[j] = nums1[f];
                    f--;
                }
            }
        }
    }
}