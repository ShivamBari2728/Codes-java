public class Searching_Rotated_Sorted_array {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,9,0,1,2};
        int ans= pivit(arr);
        System.out.println(ans);
        int ans2=search(arr, 5, ans);
        System.out.println(ans2);

        
    }
    static int pivit(int[]a)
    {
       for(int i=0;i<=a.length;i++)
       {
            if(a[i+1]>a[i])  //For Dublicate numbers change condition to ..
            {                // ----   if(a[i+1]>=a[i])  -----
                continue;
            }
            else{
                return i;
            }
       }
       return 0;
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

        start = peak+1;
        end = a.length-1;
        while(start<=end)
        {
         int mid2= start +(end-start)/2;
         if (target>a[mid2])
         {
            start=mid2+1;
         }
         else if(target<a[mid2])
         {
            end = mid2 -1;
         }
         else 
         {
            return mid2;
         }
        }
        return -1;
    }
    
}
