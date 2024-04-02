public class MinMax {

    public static void MinMaxMethod(int[] array) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++) {
            if (max < array[i]){
                max=array[i];
            }
            if (min > array[i]) {
                min=array[i];
            }
        }
        System.out.println("Minimum value is: " + min);
        System.out.println("Maximum value is: " + max);
    }
    
    public static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println("Original array:");
        printArray(arr);
        MinMaxMethod(arr);

    }
}
