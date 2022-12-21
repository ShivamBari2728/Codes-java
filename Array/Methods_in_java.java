import java.util.Scanner;

public class Methods_in_java {
    public static int add(int a, int b)   //Ststic methods ccan be access in main methhod without object..
    {
        return a+b;
    }
    int sub(int a, int b)
    {
        return a-b;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter 2 numbers: ");
        Scanner inp = new Scanner(System.in);
        int ac = inp.nextInt();
        int bc = inp.nextInt();
        inp.close();
        
        Methods_in_java obj = new Methods_in_java(); //Creating object of class.. 

        System.out.println("Addition is "+ add(ac,bc));
        System.out.println("Addition is "+ obj.sub(ac,bc)); //Calling method using object..

    }
}
