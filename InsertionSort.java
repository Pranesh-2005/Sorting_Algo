
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 4, 1, 3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int k = arr[i],j=i-1;
            while(j>=0 && arr[j]>k) arr[j+1] = arr[j--];
            arr[j+1] = k;
        }
    }
}