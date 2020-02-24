package Java8;
/*3) Using (instance) Method reference create and
 apply add and subtract method and
using (Static) Method reference create and apply multiplication method for the functional interface created.*/
@FunctionalInterface
interface MyInterface1
{
    void display(int a,int b);
}
 class myClass3
 {
     static void Multiply(int a,int b)
     {
         System.out.println("Multiplication result : " +(a*b));
     }
      void Add(int a,int b)
     {
         System.out.println("addition result : " +(a+b));
     }
      void Subtraction(int a,int b)
     {
         System.out.println("subtraction result : " +(a-b));
     }
     public static void main(String[] args)
     {
      MyInterface1 Multiply=myClass3::Multiply;
      Multiply.display(2,3);
         MyInterface1 add=new myClass3()::Add;
         add.display(12,3);
         MyInterface1 sub=new myClass3()::Subtraction;
         sub.display(8,3);

     }
}
