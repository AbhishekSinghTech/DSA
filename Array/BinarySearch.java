


public class BinarySearch {
    public static int binarySearch(int[] arr, int key) { 
        int start=0;
        int end = arr.length-1;
        
        while (start <= end) { 
            int mid=(end+start)/2;
            if(arr[mid] == key){
                return mid;
            } 
  
            // If key is greater, ignore left half  
            if (arr[mid] < key){  
                start = mid + 1;
            }  
  
            // If key is smaller, ignore right half  
            else{
                end = mid - 1;
            }   
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{2, 4, 6, 8, 10,12};
        int key=10;
        int result=binarySearch(arr, key);
        System.out.println("The element "+key+" is present at index "+result);
    }
}