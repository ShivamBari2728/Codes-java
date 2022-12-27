//      To Find Floor number of given number in array


public class GreatestSmallerNumber {
    public static void main(String[] args)
    {
        int[] arr = {1,34,67,89};
        int ans = Serach(arr, 34);
        System.out.println(ans);

    }
    static int Serach(int[]a, int target)
    {
        int Start = 0;
        int End = a.length - 1;
        while(Start <= End)
        {
            int mid = Start+(End-Start)/2;
            if(target < a[mid]) 
            {
                End = mid - 1;
            }
            else if(target > a[mid]) 
            {
                Start = mid + 1;
            }
            else
            {
                return mid;
            }

        }
        return End;
    }
    
}
