import java.lang.annotation.Target;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {4,7,7,8,8,10};
        int target=7;
        int ans = search1(arr, target);
        int ans2 = search2(arr,target);
        System.out.println(ans+" "+ans2);

    }
    static int search1(int[] a,int target)
    {
        int start = 0;
        int end = a.length-1;
        //int mid2 =0;
        int ans2=0;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            //mid2= mid;
            if (target <= a[mid])
            {
                end = mid -1;
                ans2 = mid;
            }
            else{
                start = mid + 1;
            }

        }

        return ans2;

    }
    static int search2(int[]a,int target)
    {
        int start = 0;
        int end = a.length-1;
        int ans2=0;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            //mid2= mid;
            if (target >= a[mid])
            {
                start = mid +1;
                ans2 = mid;
            }
            else{
                end = mid - 1;
            }

        }
        return ans2;
    }
    
}
