//works for both assending order and desending order array...

//                  Binery Search
public class Ass_Dess_Search {
    public static void main(String[] args)
    {
        int[] abc={100,54,42,24,5};
        int target = 24;
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
           if(a[0]<a[(a.length-1)]) 
           {
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
            else if(a[0]>a[(a.length-1)])
            {
                if ( find < a[mid]) // Left hand side..
                {
                    S = mid + 1;
                }
                
                else if (find > a[mid] ) // Right hand side..
                {
                    E = mid - 1;
                }
                
                else
                {    // ans found..
                    return mid ;
                }
            }
        }
        return -1;
    }
    
}
