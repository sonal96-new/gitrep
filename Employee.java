
//5. WAP to show object cloning in java using cloneable and copy constructor both.
package java2;

 class Employee implements Cloneable {
     String EmpName;
     int EmpCode;

     Employee(String EmpName,int EmpCode){
         this.EmpName=EmpName;
         this.EmpCode=EmpCode;
     }
     Employee(Employee e)
     {
         System.out.println("Copy constructor called");
         EmpName = e.EmpName;
         EmpCode = e.EmpCode;
     }

     public Object clone()throws CloneNotSupportedException{
         return super.clone();
     }
     public static void main(String[] args) {
         try{
             Employee e1=new Employee("Rohit",101);
             Employee e2=(Employee)e1.clone();
             System.out.println(e1.EmpName + " " + e1.EmpCode);
             System.out.println(e2.EmpName + " " + e2.EmpCode);
             //copy constructor is called
             Employee e3=new Employee(e1);
             System.out.println(e3.EmpName + " " + e3.EmpCode);

         }
         catch(CloneNotSupportedException c){
             System.out.println("The exception is occured ");
         }

     }
 }

