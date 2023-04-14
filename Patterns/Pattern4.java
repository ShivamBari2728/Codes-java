// Pattern:-
//       * 
//       * * 
//       * * * 
//       * * * * 
//       * * * * * 
//       * * * * 
//       * * * 
//       * * 
//       * 
public class Pattern4 {
    static int n =5;
    public static void main(String[] args) {
        for(int row=1;row<=2*n;row++)
        {
            int totalColsinRow=row>n ? 2*n -row : row;
            for(int col=0;col<totalColsinRow;col++)
            {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}