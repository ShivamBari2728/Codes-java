public class Number_of_Rotation_Rotated_Array {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,9,0,1,2};
        int ans= pivit(arr);
        System.out.println("\nThe array is rotated " +ans+ " times"); 
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
                return i+1;
            }
       }
       return 0;
    }
}
