// Pattern7:-
//          1
//         212
//        32123
//       4321234

public class Pattern7 {
        public static void main(String[] args) {
            int n=4;
            for(int row=1;row<=n;row++)
            {
                for(int space = row;space <n;space++)
                {
                    System.out.print(" ");
                }
                for(int numleft = row;numleft>0;numleft--)
                {
                    System.out.print(numleft);
                }
                for(int numright=2;numright<=row;numright++)
                {
                    System.out.print(numright);
                }
                System.out.println();
            }
        }
    }
