import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 4, 1, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIn = i;
            for(int j=i+1;j<arr.length;j++)
                if(arr[j]<arr[minIn]) minIn = j;
            int t = arr[minIn];
            arr[minIn] = arr[i];
            arr[i] = t;
        }
    }
}