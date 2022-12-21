import java.util.ArrayList;
import java.util.Scanner;

public class Array_List
{
    public static void main(String[] args) {
        //Syntax
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(11);
        list.add(14);
        list.add(178);
        list.add(1090);
        System.out.print(list);
        
        
        //Taking input
        
        
        Scanner obj = new Scanner(System.in);
        System.out.print("\nEnter 10 elements in array list: ");
        for( int i = 0 ; i < 4; i ++)
        {
            int a = obj.nextInt();
            list.add(a);
        }
        System.out.println("\nOutput");
        System.out.print(list);
    }
}