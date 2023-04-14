// Pattern8:-
//          0 0 0 0 0 0 0 0 0 
//          0 1 1 1 1 1 1 1 0 
//          0 1 2 2 2 2 2 1 0 
//          0 1 2 3 3 3 2 1 0 
//          0 1 2 3 4 3 2 1 0 
//          0 1 2 3 3 3 2 1 0 
//          0 1 2 2 2 2 2 1 0 
//          0 1 1 1 1 1 1 1 0 
//          0 0 0 0 0 0 0 0 0 
public class Pattern8 {
    public static void main(String[] args) {
        int n = 8;
        for(int row=0;row<=n;row++)
        {
            for(int col=0;col<=n;col++)
            {
                int Indexvalue=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(Indexvalue+" ");
            }
            System.out.println();
        }
    }
}
