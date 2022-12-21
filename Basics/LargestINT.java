//DSA java
import java.util.Scanner;

public class LargestINT {
    public static void main(String args[])
    {
    System.out.print("Enter 3 numbers: ");
    Scanner inp = new Scanner(System.in);
    int a = inp.nextInt();
    int b = inp.nextInt();
    int c = inp.nextInt();
    int max = a;
    if ( b>max)
    {
        max = b;
    }
    if (c>max)
    {
        max = c;
    }
    System.out.println("largest integer is "+ max);

    inp.close();
    }
}
