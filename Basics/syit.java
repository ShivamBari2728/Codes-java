class It {
    static String room = "702";
    
}

public class syit{
    public static void main(String[] args)
    {
        It obj = new It();
        It obj2 = new It();
        It obj3 = new It();

        System.out.println(obj.room);
        obj.room = "601";
        System.out.println(obj3.room);
        System.out.println(obj2.room);
    }
}
