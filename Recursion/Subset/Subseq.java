package Java.Recursion.Subset;

public class Subseq {
    public static void main(String[] args) {
        Solve("", "abc");
        
    }
    public static void Solve(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        Solve(p+ch, up.substring(1));
        Solve(p, up.substring(1));

    }
}
