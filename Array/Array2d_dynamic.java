public class Array2d_dynamic {
    public static void main(String[] args) {
        int [][] arr =
        {
            {1,2,3},
            {2,3,4,5},
            {1,4}
        };
        for( int i =0; i< arr.length; i ++)
        {
            for ( int col = 0; col < arr[i].length; col ++)
            {
                System.out.print(arr[i][col]+" ");
            }
            System.out.println();
        }
    }
}
