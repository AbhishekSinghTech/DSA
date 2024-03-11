public class BubbleSort {
    public static void bubbleSort(int[] arr) { 
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,3,42,23,34,56,44,78};
        
        System.out.println("Array Before Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("\nArray After Sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}