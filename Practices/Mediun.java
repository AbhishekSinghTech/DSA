public class Mediun {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = mergeArrays(nums1, nums2);

        int n = merged.length;
        if (n % 2 == 0) {
            int mid1 = merged[n / 2 - 1];
            int mid2 = merged[n / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            return (double) merged[n / 2];
        }
    }

    private static int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, index = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[index++] = nums1[i++];
            } else {
                merged[index++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            merged[index++] = nums1[i++];
        }

        while (j < nums2.length) {
            merged[index++] = nums2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int num1[] = {2, 3, 4, 5, 6};
        int num2[] = {7, 8, 9, 10, 11, 12};

        double median = findMedianSortedArrays(num1, num2);
        System.out.println("The median is " + median);
    }
}