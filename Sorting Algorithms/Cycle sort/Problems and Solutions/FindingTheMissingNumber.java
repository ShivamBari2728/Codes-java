import java.util.Arrays;

public class FindingTheMissingNumber {
    public static void main(String[] args) {
        int[] arr={4,1,0,2};  //for arr 1 to n only...
        sort(arr);
        int missingno= findingmissing(arr);
        //System.out.println(ans);
        System.out.println("\nSorted array is "+Arrays.toString(arr));
        System.out.println("\nThe missing number is " +missingno);
    }
    static void sort(int[] arr)
    {
        int i=0;
        int N= (arr.length);
        while (i<arr.length)
        { 
            int temp=(arr[i]);
            if(arr[i]==N)
            {
                i++;
            }
            else
            {
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
        
        
    }
    static void swap(int i,int[] arr)
    {
        int temp=arr[i];
        arr[i]=arr[temp];
        arr[temp]=temp;

    }
    static int findingmissing(int[] arr)
    {
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!= i)
            {
                return i;
            }
            
        }
        return arr.length;
    }
    
}
