
public class SubArray1 {
    public static void subArraySearch(int[]arr){
        int currSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    // System.out.print(arr[k]+"  ");
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(MaxSum < currSum){
                    MaxSum=currSum;
                }
            }
        }
        System.out.println("Maximum SubArray is"+ MaxSum);
       
    }
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, -4, 5,  6};
        System.out.println("Original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Array after calling the method 'SubArray': ");
        subArraySearch(arr);
    }
}