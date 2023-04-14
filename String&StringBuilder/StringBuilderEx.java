/* 
The StringBuilder class in Java is a mutable sequence of characters, 
which means that it can be modified over time, 
rather than being immutable like the String class.
*/

public class StringBuilderEx
{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(); 
        for(int i =0 ; i< 26;i++)
        {
            char ch = (char)('A'+i);
            str.append(ch);
        }
        System.out.println(str.toString());
    }
}