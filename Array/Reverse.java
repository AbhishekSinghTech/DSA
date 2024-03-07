

public class Reverse {
    public static void reverseArray(int[] arr){
        int start=0;
        int end = arr.length-1;
        while (start <=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4};
        System.out.println("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        reverseArray(arr);
        System.out.println("\nReversed array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}