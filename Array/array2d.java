import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        int column = 3;
        int [][] arr2d = new int [3][column]; // creating object for 2d array...
        Scanner inpu = new Scanner(System.in);

        //Input.....
            for( int i = 0; i< arr2d.length; i ++)
            { 
                System.out.println("Enter the values for Row " +(i+1));
                for( int j =0 ; j < column; j ++)
                {
                    int a = inpu.nextInt();
                    arr2d[i][j]= a;
                }
            }

        //Output.........
        System.out.println("Output is : --- ");
            for( int j =0 ; j < column; j ++)
            {
                System.out.print(arr2d[0][j]);
                
                
            }
            System.out.println();
            for( int j =0 ; j < column; j ++)
            {
                System.out.print(arr2d[1][j]);
                
                
            }
            System.out.println();
            for( int j =0 ; j < column; j ++)
            {
                System.out.print(arr2d[2][j]);
                
                
            }
            System.out.println();

        

    }
    
}
