//Program to skip any specific substring from a string.
package Java.Recursion;

public class RemovingAString {
    public static void main(String[] args) {
        String St = "Shivam is a bad man"; //Removing bad from string.
        String ans=SkipString(St);
        System.out.println(ans);
        
    }
    public static String SkipString(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }
        if(s.startsWith("bad")) //Checks if string starts with specific string.
        {
            return SkipString(s.substring(3));
        }else{
            return s.charAt(0) + SkipString(s.substring(1));
        }
    }
}
