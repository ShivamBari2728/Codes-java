public class Finding_Element_In_Infinit_Array {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,65,78,90,120,130,140,450,789,799,892,1000};
        int target = 120;
        int ans = FindRange(arr,target);
        int ans2=Search2(arr, ans, target);

        System.out.println("The End is " + ans);
        System.out.println("The index of target is "+ ans2);

        
    }
    static int FindRange(int[] a, int target)
    {
        int start=0;
        int end = 1;
        while(true)
        {
            if (target <= a[end])
            {
                return end;
            }
            else{
                start=end+1;
                end = end * 2;
            }
        }

    }
    static int Search2(int[] a,int end,int find)
    {
        int S=0;
        int E = end;
        
        while(S<=E)
        {
            int mid = S+(E-S)/2;
            
            
            if ( find < a[mid]) // Left hand side..
            {
            E = mid - 1;
            }
            
            else if (find > a[mid] ) // Right hand side..
            {
            S = mid + 1;
            }
            
            else
            {    // ans found..
                return mid ;
            }
        }
        return -1;
    }
}
