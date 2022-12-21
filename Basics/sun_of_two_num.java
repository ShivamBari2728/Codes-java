import java.util.Scanner;

//DSA Java

public class sun_of_two_num {
    public static void main(String[] args) {
        System.out.print("Enter two integer values :" );
        Scanner num = new Scanner(System.in);
        
        int a = num.nextInt();
        int b = num.nextInt();
        int s = a+b;
        System.out.println("Sum of numbers is "+ s);
        num.close();
    }
}
