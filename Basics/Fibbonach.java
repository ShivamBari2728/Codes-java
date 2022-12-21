//DSA java
import java.util.Scanner;

public class Fibbonach {
    public static void main(String[] args)
    {
        System.out.print("Enter any number: ");
        Scanner inp = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = inp.nextInt();
        
        for(int i = 0;i<=n-2;i++)
        {
            int c=a+b;
            int temp = b;
            a=temp;
            b=c;
        }
        System.out.println("Answer is : "+ b);
        inp.close();

    }
}
