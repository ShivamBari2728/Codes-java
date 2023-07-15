import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array={7,1,5,2,9,0};
        Quick_Sort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));

        
    }
    public static void Quick_Sort(int[]arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
    while(s<=e)
    {

        
        while(arr[s]<pivot)
        {
            s++;
        }
        while(arr[e]>pivot)
        {
            e--;
        }
        if(s<=e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        
    }
    Quick_Sort(arr, low,e);
    Quick_Sort(arr, s, high);
    }
    
}
