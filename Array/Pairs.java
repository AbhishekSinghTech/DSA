


public class Pairs {
    public static void pairsMachine(int[] array) {
        for(int i=0;i<array.length;i++){
            int current=array[i];
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+current+","+array[j]+")");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = new int[]{2, 4, 6, 8 , 10};
        System.out.println("Original Array: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Array after calling the method 'pairsMachine': ");
        pairsMachine(arr1);
    }
}