import java.util.Scanner;
public class SelectionSort{

    public static void SelectionMethod(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min_index = i;
            for (int j = i+1;j < arr.length;j++ ){
                if(arr[j] < arr[min_index]){
                    int temp=arr[j];
                    arr[j]=arr[min_index];
                    arr[min_index]=temp;
                }
            }
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[8];
        System.out.println( "Enter the elements of array" );
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Selection Before Sorting:");
        for(int elements:arr) {
            System.out.print(elements + "\t");
        }
        System.out.println("\n\nSelection After Sorting:\n");
        SelectionMethod(arr);
        for(int elements : arr) {
            System.out.print(elements + "\t");
        }
    }
}