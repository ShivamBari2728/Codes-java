//DSA java
import java.util.Scanner;

public class Count_Occering {
    public static void main(String[] args)
    {
       System.out.print("Enter numbers: ");
       Scanner inp = new Scanner(System.in);
       String a = inp.next();
       System.out.print("Enter You want to check: ");
       String n = inp.next();
       char n2=n.charAt(0);
       int b = a.length();
       System.out.println(b);
       int count=0;
       for ( int i = 0; i<b;i++)
       {
            char c = a.charAt(i);
            
            if (c==n2)
            {
                
                count++;
            }
       }
       System.out.println(n +" Occured " + count+" Times.");
       inp.close();
        
    }
    
}
