public class MaxSubArray3 {

    public static void MaxSubArraySearch(int[]arr){
        int currSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum>MaxSum){
                MaxSum=currSum;
            }else if (currSum < 0){
                currSum = 0;
            }
        }
        System.out.println("The maximum subarray is: "+MaxSum);
    }
    public static void main(String[] args) {
        int nums1[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Original Array: ");
        for (int i : nums1) {
            System.out.print(i + " ");
        } 
        System.out.println();
        System.out.println("Array after calling the method 'SubArray': ");
        MaxSubArraySearch(nums1);
    }
}