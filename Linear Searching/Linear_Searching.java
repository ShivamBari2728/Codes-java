//package Linear Searching;

public class Linear_Searching {
    public static void main(String[] args) {
        int[] arr = {12,34,643,67,89};
        int target = 340;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    public static int search(int[] a,int b)
    {
        if (a.length==0)
        {
            System.out.println("Array is Empty.");
            return 0;
        }
        for(int i = 0 ; i<a.length; i ++)
        {
            if(a[i]==b)
            {
                System.out.print("Element found at index: ");
                return i;
            }
        }
        System.out.print("Cant find the element...");
            return 0;
    }
    
}
