public class palandromeEx {
    public static void main(String[] args) {
        String str = "abcba";
    }
    public Boolean Test(string str)
    {
        int Start = 0;
        int End = str.length();
        while (Start<=End)
        {
            if (str.charAt(Start)==str.charAt(End))
            {
                Start = Start +1;
                End = End - 1;
            }
            else
            {
                return false;
            }
        }
        return true;

    }
}
