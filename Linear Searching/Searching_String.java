//package Linear Searching;

public class Searching_String {
    public static void main(String[] args) {
        String str = "Shivam";
        char t = 'S';
        search(str, t);
    }
    public static void search(String a,char b)
    {
        if (a.length()==0)
        {
            System.out.println("String is Empty.");
            
        }
        // for(int i = 0 ; i<a.length(); i ++)
        // {
        //     if(a.charAt(i)==b)
        //     {
        //         System.out.print("Element found");
                
        //     }
            
        // }
        for(char ch: a.toCharArray()) //Converting String to array and iterating..
        {
            if ( ch == b)
            {
                System.out.println("Element found!!!");
            }
        }
        
    }
}
