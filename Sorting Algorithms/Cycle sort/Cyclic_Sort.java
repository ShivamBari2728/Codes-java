import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr={4,3,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr)
    {
        int i=0;
        while (i<arr.length)
        { 
            int temp=0;
            temp=arr[i];
            if(arr[i]!=arr[temp-1])
            {

                swap(i,arr);
            }
            else
            {
                i++;
            }
            
        }
    }
    static void swap(int i,int[] arr)
    {
        int temp=arr[i];
        arr[i]=arr[temp-1];
        arr[temp-1]=temp;

    }
}
