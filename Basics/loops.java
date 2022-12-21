import java.util.Scanner;

//import org.w3c.dom.stylesheets.StyleSheetList;

public class loops
{
    public static void main(String args[])
    {
        System.out.println("Enter any number");
        Scanner inpu = new Scanner(System.in);
        int a = inpu.nextInt();
        inpu.close();

        //Using For loop...


        /*
        
        for (int i=0 ; i<=a;i++)
        {
            System.out.print(i+" ");
        }
        
        */

        //Using While loop....
        
        /* int i = 0;
        while (i<=a)
        {
            System.out.println(i + " ");
            i++;
        }
        */

        //Using Do while loop
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<=a);
        inpu.close();
    }
}