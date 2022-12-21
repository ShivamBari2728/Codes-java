import java.util.Scanner;

public class Array_input{
    public static void main(String[] args) {
        int[] a= new int[5];

        Scanner obj = new Scanner(System.in);


        for(int  i =0 ; i<a.length; i ++)
        {
            System.out.println("Enter the value for arr["+i+"]");
            int b = obj.nextInt();
            a[i]=b;
        }
        for(int  i =0 ; i<a.length; i ++)
        {
            System.out.println("The value in arr["+i+"]  is "+a[i]);
        }
    }
}