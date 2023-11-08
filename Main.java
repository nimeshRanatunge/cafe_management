import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // Insertion sort
        int[] arr = new int[] { 12, 3, 4, 1, 45, 23, 5 };
        int n = arr.length;
        insertionSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int n) {
        for(int i=1; i<n; i++){
            int value = arr[i];
            int hole = i;
            while (hole>0 && value<arr[hole-1]) {
                int temp = arr[hole];
                arr[hole] = arr[hole-1];
                arr[hole-1] = temp; 
                hole--;
            }
            arr[hole]= value;
        }
    }
}