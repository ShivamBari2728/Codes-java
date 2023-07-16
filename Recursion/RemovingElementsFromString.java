//Program to skip any specific char from a string.


package Java.Recursion;
public class RemovingElementsFromString {
    public static void main(String[] args) {
        String str="bsdara";

        int end=str.length()-1;
        System.out.println("\nOrignal String:- "+str);
        String ans=Solving(str, 0, end);
        System.out.println("Answer without using recursion:- "+ans);
        Solve_recursion("", str);
        
    }

    //Without recursion.........

    public static String Solving(String s,int start,int end)
    {
        String ans="";
        while(start<=end)
        {
            
            if(s.charAt(start)=='a')
            {
                start++;
                //continue;
            }
            else{
                ans=(ans+s.charAt(start));
                start++;
            }
        }
        return ans;
        
    }

    //With Recursion.....

    public static void Solve_recursion(String p,String u)
    {
        if(u.isEmpty())
        {
            System.out.println("Answer using Recursion:- "+p);
            return;
        }
        char ch=u.charAt(0);
        if(ch=='a')
        {
            Solve_recursion(p, u.substring(1));
        }
        else{
            Solve_recursion(p+ch, u.substring(1));
        }
    }
    
}


