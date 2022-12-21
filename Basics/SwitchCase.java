import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args)
    {
        System.out.print("Enter day :");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.close();
        switch (a)
        {
            case 1,2,3,4,5 -> System.out.println("Weakdays");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
