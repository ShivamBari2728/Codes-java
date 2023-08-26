package Java.AbstractDemo;

public class Main {
    public static void main(String[] args)
    {
        Sonclass son= new Sonclass();
        Daughter daughter = new Daughter();

        son.carrer();
        son.partner();

        daughter.carrer();
        daughter.partner();

        Parentclass.sayhello(); //Calling static method wihout object.

    }
    
}
