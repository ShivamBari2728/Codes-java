public class Searching_2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,5},
            {23,56,78},
            {45,76,89}
        };
        boolean ans = search(arr, 78);
        System.out.println(ans);
    }
    public static boolean search(int[][]a,int b)
    {
        int row = a.length;
        int col = 3;
        for(int i = 0 ;i < row; i ++ )
        {
            for (int j = 0 ;j < col; j ++)
            {
                if ( a[i][j] == b )
                {
                    System.out.println("Element found...");
                    return true;
                }
            }
        }
        System.out.println("Element not found..");
        return false;
    }
    
}
