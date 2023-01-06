import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args) {
        int[] array1={8,1,6,2,4};
        System.out.print("\nOrignal array :- ");
        System.out.println(Arrays.toString(array1));
        sorting(array1);
        System.out.print("\nSorted array :- ");
        System.out.println(Arrays.toString(array1));
      
     }
    static void sorting(int[] arr)
    {
        
        for (int i=0;i<arr.length;i++) 
        {
           int end=arr.length-1-i;
           int max= findmax(arr,end);
           swap(arr,end,max);
           
        }
        
    }
    static int findmax(int[]a,int end)
    {
        int maximum=0;
        for(int i=0;i<=end;i++)
        {
            if(a[i]>a[maximum])
            {
                maximum=i;
            }
        }
        return maximum;
    }
    static void swap(int[] a,int first , int second)
    {
        int temp=a[second];
        a[second]=a[first];
        a[first]=temp;
    }
    
        
    
}