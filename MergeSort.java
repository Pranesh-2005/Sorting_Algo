public class MergeSort{
    public static void main(String[] js){
        int[] a = {5,2,6,4,1,3};
        mergerSort(a);
    }
    public static void mergerSort(int[] a){
        int l = 0,r=a.length-1;
        mergerSort(a,l,r);
    }
    public static void mergerSort(int[] a,int l,int r){
        if(l<r){
            int m = l+(r-l)/2;
            mergerSort(a,l,m);
            mergerSort(a,m+1,r);
            merge(a,l,m,r);
        }
    }
    public static void merge(int[] a,int l,int m,int r) {
        int n1 = m-l+1,n2 = r-m;
        int[] L = new int[n1],R=new int[n2];
        for(int i=0;i<n1;i++) L[i] = a[l+i];
        for(int i=0;i<n2;i++) R[i] = a[r+i+1];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2) a[k++] = L[i]<=R[i] ? L[i++] : R[j++];
        while(i<n1) a[k++] = L[i++];
        while(j<n2) a[k++] = R[j++];
    }
}