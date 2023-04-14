// Pattern6:-
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 
public class Pattern6 {
    public static void main(String[] args) {
        int n=4;
        for(int row=0;row<=n;row++)
        {
            for(int space=row;space<n;space++)
            {
                System.out.print(" ");
            }
            for(int star=0;star<=row;star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row2=0;row2<n;row2++)
        {
            for(int space2=0;space2<=row2;space2++)
            {
                System.out.print(" ");
            }
            for(int star2=row2;star2<n;star2++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
