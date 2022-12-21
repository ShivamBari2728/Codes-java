import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgument {
    public static void main(String[] args) {
      funct(1,2,3,4,5,6);  
      multi(5, "Shivam", 1,2,3,4,5);
    }
    static void funct(int ...v)  //Can Take multiple arguments as a array....
    {
        System.out.println(Arrays.toString(v));
    }
    static void multi(int a , String b , int ...c)  //VarArgs must be in last of the parameters...
    {
        System.out.println(a+" " +b+" "+Arrays.toString(c));
    }
}
