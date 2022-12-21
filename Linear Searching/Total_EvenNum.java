public class Total_EvenNum {
    public static void main(String[] args) {
        int[] nums = {12,4,75,4};
        int ans= search(nums);
        System.out.println(ans);

    }
    public static int search(int[] a)
    {   int even= 0;
        int num = 0;
        System.out.print("Even numbers is ");
        for(int i = 0;i < a.length;i ++)
        {
           if ( a[i]%2 == 0)
           {
              even++;
              num = a[i];
              System.out.print(" "+ num);
           } 
            
        }
        System.out.print("\nNumber of even numbers is : ");
        return even;
    }
}
