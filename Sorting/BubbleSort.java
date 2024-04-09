public class BubbleSort {

    public static void SolveMethod(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp  = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int  arr[] = {2,7,4,1,5,3};
        System.out.println("Given Array");  
        for( int element:arr){
            System.out.print(element +" ");
        }
        SolveMethod(arr);
        System.out.println("\nSorted array");
        for( int element:arr){
            System.out.print(element+" ");
        }
    }
}
