public class Maximum_ElementArray {
    public static void main(String[] args) {
        int[] arr = {1,4,6,889,10};
        System.out.println(max(arr));
    }
    public static int max(int[]a)
    {
        int maximum = a[0];
        for(int i = 0; i<a.length;i++)
        {
            if(maximum< a[i])
            {
                maximum = a[i];
            } 

        }
        return maximum;
        
    }

}
