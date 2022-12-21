//works for assending order array...

//        Binery Search
public class BinarySearchEx {
    public static void main(String[] args)
    {
        int[] abc={24,45,52,89,99};
        int target = 100;
        int ans = Search2(abc, target);
        System.out.println("Target is at index "+ans);
    }
     static int Search2(int[] a,int find)
    {
        int S=0;
        int E = a.length-1;
        
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
