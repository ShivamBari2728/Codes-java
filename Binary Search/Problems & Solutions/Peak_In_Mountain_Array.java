public class Peak_In_Mountain_Array {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,3,1};
        int ans = Peak(arr);
        System.out.println("The peak element in the array is " + ans);
        
    }
    static int Peak(int[]a)
    {
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
        return a[mid];
        
    }
}
