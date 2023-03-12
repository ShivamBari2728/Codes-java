public class StringComparision {
    public static void main(String[] args) {
        String name1 = "Shivam";
        String name2 = "Shivam";
        //Both referance variable will point to same object;
        //And Object will be created inside String pool.
        System.out.println(name1 == name2); //Checks for the same object.

        
        String name3 = new String("Shivam");
        String name4 = new String("Shivam");
        //Diffrent object for diffrent variables.
        //And String will be created out side the String pool.
       
        System.out.println(name3 == name4); //Checks for the same object.
        System.out.println(name3.equals(name4)); //Only Checks the value not object.
        
    }
    
}
