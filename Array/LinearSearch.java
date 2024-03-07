

public class LinearSearch {

    public static int search(int[] arr, int x){
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int key =60;
        int index=search(arr,key) ;
        if (index == -1){  
            System.out.println("Element is not present in array");
        }  
        else{
            System.out.println("Element is present at index " + index);
        } 
    }    
}