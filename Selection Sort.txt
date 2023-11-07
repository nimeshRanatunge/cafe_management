import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // selection sort
        int[] arr = new int[] { 12, 3, 4, 1, 45, 23, 5 };
        int n = arr.length;
        selectionSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int n) {
       for(int i=0; i<n-1; i++){
        int min = i;
        for(int j=i+1; j<n; j++){
            if(arr[j]<arr[min]) {
                min = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
       }
    }
}