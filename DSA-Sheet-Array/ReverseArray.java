/**
 * Reverse
 */
public class ReverseArray {

    public static void ReverseMethod(int[]arr){
        int first=0;
        int last=arr.length-1;
        while (first <last) {
            int temp = arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

            first++;
            last--;
        }
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
        System.out.println("Reversed array:");
        ReverseMethod(arr);
        printArray(arr);
    }
}