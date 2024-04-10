import java.util.Scanner;

public class InsertionSort{
    public static void InsertionMethod(int []arr){
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println( "The original array is : ");  
        for(int j : arr)  {     
          System.out.print(j + "\t");        
        }   
        System.out.println("\n\n The sorted array in ascending order using insertion sort method is : ");    
        InsertionMethod(arr);            
        for(int k : arr)  {            
          System.out.print(k + "\t");    
        }      
    }
}