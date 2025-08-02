import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int [] arr = {5,2,6,4,1,3};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
}