import java.util.Arrays;
public class QuickSort{
    public static void main(String[] js) {
        int[] a = {5,2,6,4,1,3};
        quickSort(a);
        System.out.print(Arrays.toString(a));
    }
    public static void quickSort(int[] a){
        int l = 0, r = a.length-1;
        quickSort(a,l,r);
    }
    public static void quickSort(int[] a,int l,int r){
        if(l<r){
            int p = partition(a,l,r);
            quickSort(a,l,p-1);
            quickSort(a,p+1,r);
        }
    }
    public static int partition(int[] a,int l,int r){
        int piv = a[r],i=l-1;
        for(int j=l;j<r;j++){
            if(a[j]<piv){
                int t = a[++i];
                a[i] = a[j];
                a[j]= t;
            }
        }
            int t = a[i+1];
            a[i+1] = a[r];
            a[r] = t;    
        return i+1;
    }
}