//package Linear Searching;

public class Minimum_num {
    public static void main(String[] args) {
        int[] arr = {45,989,10,98};
        int ans = min(arr);
        System.out.println(ans);

        
    }
    public static int min(int[] a)
    {
        int minimum = a[0];
        for(int i =0;i<a.length;i++)
        {
            if (a[i]<minimum)
            {
                minimum = a[i];
            }
        }
        return minimum;
    }
    
}
