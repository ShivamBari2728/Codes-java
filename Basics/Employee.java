//College practical

public class Employee {
    String CollegeName="CSC";
    public Employee(int a,String name)
    {
        System.out.println("Employee is id = "+a+" Emplyee name is "+name);
    }
    public void Empmethod()
    {
        System.out.println("College name is "+CollegeName);
    }
    public static void main(String args[]){
    Employee emp = new Employee(101,"Shivam");
    emp.Empmethod();
    }
}
