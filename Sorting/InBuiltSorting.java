import java.util.Arrays;
import java.util.Collections;
public class InBuiltSorting {
    public static void main(String[] args) {
        Integer arr[] = {1,4,5,2,7,9,7,4,3};
        
        System.out.println("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        // Sort the array using built-in sorting method in Java

        // Arrays.sort(arr);     // 1 2 3 4 4 5 7 7 9
        //Arrays.sort(arr,2,5);   //  1 4 2 5 7 9 7 4 3
        //Arrays.sort(arr,Collections.reverseOrder());    // 9 7 7 5 4 4 3 2 1
        Arrays.sort(arr,2,5,Collections.reverseOrder());  // 1 4 7 5 2 9 7 4 3
        
        System.out.println("\n\nSorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
