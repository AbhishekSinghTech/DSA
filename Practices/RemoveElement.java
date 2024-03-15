
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] arr = {3,2,2,3};
        int val=3;
        System.out.println("Before removing " + val + ": ");
        for (int x : arr) {
            System.out.print(x + ",");
        }
        System.out.println("\nAfter removing " + 3 + ": ");
        int len = re.removeElement(arr,val);
        for (int x = 0; x < len; x++) {
            System.out.print(arr[x] + ",");
        }
    }
}