

class phone
{
    void showtime()
    {
        System.out.println("Time is 9 am.");
    }
    void turnon()
    {
        System.out.println("Phone turning on....");
    }
}

class Smartphone extends phone{
    @Override
    void turnon()
    {
        System.out.println("Turining on smartphone.");
    }
    void playmusic()
    {
        System.out.println("Music is playing...");
    }
}


public class DynamicMethodDisp {

    public static void main(String[] args) {
        phone obj = new Smartphone();
        obj.turnon();
        obj.showtime();
       // obj.playmusic();  not allowed.
    }


    
}
