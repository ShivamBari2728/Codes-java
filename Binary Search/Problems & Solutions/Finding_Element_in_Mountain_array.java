//import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class Finding_Element_in_Mountain_array {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,3,1};
        int ans = Peak(arr);
        System.out.println("\nThe peak element in the array is at index " + ans);
        int ans2= search(arr, 3, ans);
        System.out.println("\nThe element in the array is at index " + ans2);

    }
    static int Peak(int[]a)
    {
        //Finding peak element in mountain array.....

        int start=0;
        int end= a.length-1;
        int mid=0;
        while (start<=end)
        {
            mid = start +(end-start)/2;
            if(a[mid]<a[mid+1])
            {
                start = mid+1;
            }
            else
            {
                end = mid -1;
            }
            
        }
        return mid;
        
    }
    static int search(int[]a,int target,int peak)
    {  
        //Searching from 0 to peak....

        int start= 0;
        int end = peak ;
        while(start<=end)
        {
            int middle = start +(end - start)/2;
            if (target > a[middle])
            {
                start = middle +1;
            }
            else if(target< a[middle])
            {
                end = middle -1;
            }
            else 
            {
                return middle;
            }
        }

        //Searching from peak to last element in array...

        start = peak;
        end = a.length-1;
        while(start<=end)
        {
         int mid2= start +(end-start)/2;
         if (target>a[mid2])
         {
            end=mid2-1;
         }
         else if(target<a[mid2])
         {
            start = mid2 +1;
         }
         else 
         {
            return mid2;
         }
        }
        return -1;
    }
}
