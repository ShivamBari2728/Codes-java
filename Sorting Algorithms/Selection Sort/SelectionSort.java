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
            System.out.println("Step "+(i)+Arrays.toString(arr));
           int end=arr.length-1-i;    //reducing length of array be 1...
           int max= findmax(arr,end); // Finding maximum element in reduced array...
           swap(arr,end,max);         //Swap the max element with last element in reduced array
           
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