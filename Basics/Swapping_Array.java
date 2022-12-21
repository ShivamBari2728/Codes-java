import java.util.Arrays;
import java.util.Scanner;

import javax.swing.Icon;

public class Swapping_Array {
        public static void main(String[] args) {
            int [] arr = {1,2,3,5,6,3};
            System.out.print("Orignal array is : ");
            System.out.println(Arrays.toString(arr));
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter the 1st index you want to swap: ");
            int v=obj.nextInt();
            System.out.print("Enter the 1st index you want to swap: ");
            int o = obj.nextInt();
            swap(arr,v,o);
            
                
            } 
            public static void swap(int[]a,int c,int d)
            {
                int temp=0;
                temp = a[c];
                a[c] = a[d]  ;
                a[d] = temp;
                System.out.println(Arrays.toString(a));
            }
            
}
