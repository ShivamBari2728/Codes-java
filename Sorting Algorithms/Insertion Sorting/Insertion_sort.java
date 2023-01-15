import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr={8,2,6,4,1};
        sort(arr);
        System.out.println("\nFinal Step "+Arrays.toString(arr));
    }
    public static void sort(int[] arr)
    {
        for(int i=0;i<=arr.length-2;i++)
        {
            System.out.println("\nStep "+(i)+Arrays.toString(arr));
            for(int j=(i+1);j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr, j, (j-1));
                }
                else
                {
                    break;
                }
            }
        }
    }
    static void swap(int[] a,int first , int second)
    {
        int temp=a[second];
        a[second]=a[first];
        a[first]=temp;
    }
}
