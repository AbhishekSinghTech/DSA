

public class LargestNumber {
    public static int  largestNumber(int[] nums){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int []arr={10,20,30,50,40,60,80};
        int Number=largestNumber(arr);
        System.out.println("The largest number is "+Number);
    } 
}