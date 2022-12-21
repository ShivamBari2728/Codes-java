public class MostWelthy {
    public static void main(String[] args)
    {
        int[][] accounts = {
            {4,0,1},
            {4,0,1}
        };
        int ans = welth(accounts);
        System.out.println(ans);

    }
    public static int welth(int[][]a)
    {
        int acc1 = 0;
        int acc2 = 0;
       
            for ( int j = 0 ; j < 3;j++)
            {
               acc1 = acc1 + a[0][j];
               acc2 = acc2 + a[1][j];

            }
        if (acc1 > acc2)
        {
            System.out.println("Accoun 1 is welthy... ");
            return acc1;
        }
        else if (acc1 == acc2) 
        {

            System.out.println("Both are welthy...");
            return 0;
            
        }
        else
        { System.out.println("Account 2 is welthy... ");
            return acc2;
        }
    }
}
