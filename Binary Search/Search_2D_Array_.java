import java.util.Arrays;

public class Search_2D_Array_
{
    public static void main(String[] args) {
        int[][] arr={
              //c0 c1 c2
        /*r0*/ {10,20,30},
        /*r1*/ {40,50,60},
        /*r2*/ {70,80,90}
        };
        String ans= (Arrays.toString(search(arr, 40)));
        System.out.println(ans);
    }
    static int[] search(int[][] matrix,int target)
    {
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0)
        {
            if(matrix[r][c]==target)
            {
                return new int[]{r,c};
            }
            if(matrix[r][c]<target)
            {
                r++;
            }
            else
            {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}