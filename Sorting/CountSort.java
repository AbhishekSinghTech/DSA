import java.util.Scanner;

public class CountSort{
    public static void CountMethod(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int index=0;
        for(int i=0;i<count.length;i++) {
            while (count[i] >  0) {
                arr[index++]=i;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int []arr= new int[6];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("\nThe sorted array is: ");
        CountMethod(arr);
        for(int i:arr)
            System.out.print(i+" ");
    }
}