import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr={4,1,0,2,3};  //for arr 1 to n only...
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr)
    {
        int i=0;
        while (i<arr.length)
        { 
            int temp=(arr[i]);
            
            if(arr[i]!=arr[temp]) 
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
