//DSA JAVA

import java.util.Scanner;
public class input_output {
    public static void main(String[] args) {
        System.out.print("Enter any string: ");
        Scanner a = new Scanner(System.in);
        
        String st= a.nextLine();
        System.out.println("Your entered value is " + st);
        a.close();
        
    } 
}