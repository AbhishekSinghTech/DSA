public class MaxSubArray2 {
    public static void MaxsubArraySearch(int[]arr){
        int currSum=0;
        int MaxSum=Integer.MIN_VALUE;

        int []prefixSum=new int[arr.length];
        prefixSum[0]=arr[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];
                if(MaxSum < currSum){
                    MaxSum=currSum;
                }
            }
        }
        System.out.println("Maximum SubArray is : "+ MaxSum);
       
    }
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, -4, 5,  6};
        System.out.println("Original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Array after calling the method 'SubArray': ");
        MaxsubArraySearch(arr);
    }
}