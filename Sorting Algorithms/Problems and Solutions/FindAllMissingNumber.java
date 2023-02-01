import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMissingNumber {
    public static void main(String[] args) {
        int[] arr={0,8,8,4,6,4,3,1,2};
        sort(arr);
        System.out.println("\nSorted array is "+Arrays.toString(arr));
        List<Integer> ans =findingmissing(arr);   //returning as a list 
        System.out.println("\nThe missing number is " +ans);
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
    static List<Integer> findingmissing(int[] arr)
    {
        List<Integer> ans =new ArrayList<>(); 
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!= i)
            {
                ans.add(i);
            }     
        }
        return ans;
    }   
    
}
