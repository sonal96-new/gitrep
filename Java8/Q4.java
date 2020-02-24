package Java8;
/*Create an Employee Class with instance variables (String) name,
        (Integer)age, (String)city and get the instance of the Class using constructor reference*/
interface FuncInt
{
    Employee employee(String name,int age,String city);
}
class Employee
{
    String name;
    int age;
    String city;
    Employee(String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public void show()
    {

        System.out.println("EmployeeName : " + name + "\n "+ "EmployeeAge :" + age +" \n" + "EmployeeCity :" + city);
        System.out.println("\n");
    }
}
class ConstRef
 {
     public static void main(String[] args) {
         System.out.println();
         FuncInt employee = Employee::new;
         Employee e1=employee.employee("Sonal",22,"Noida");
         e1.show();
         Employee e2=employee.employee("Ritwik",18,"Kanpur");
         e1.show();
         System.out.println();

     }
}
