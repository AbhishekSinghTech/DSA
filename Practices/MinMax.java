public class MinMax {
    public static void SumMinMax(int[] array) {
        int Max=Integer.MIN_VALUE;
        int  Min=Integer.MAX_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] > Max)
                Max = array[i];
        }
        for(int i=0;i<array.length;i++){
            if (array[i] < Min)
                Min = array [i];
        }
        System.out.println("The maximum value is:"+ Max + "\nThe minimum Value Is:"+Min);
       System.out.println("Sum of Min and Max is:"+ (Min+Max));
    }
    public static void main(String[] args) {
        int[] array = new int[]{-2,1,-4,5,3};
        SumMinMax(array);
    }
}