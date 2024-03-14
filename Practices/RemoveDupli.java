public class RemoveDupli {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 1, 2, 2, 2, 3, 6, 6, 4, 5, 4, 5, 6};
        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Array after removing duplicates:");
        RemoveDupli rd = new RemoveDupli();
        int n = rd.removeDuplicates(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }  
    }
}