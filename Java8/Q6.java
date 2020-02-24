package Java8;

//Create and access default and static method of an interface.
interface Shape
{
    void area();     //abstract method
    //static method
    static void show()
    {
        System.out.println("It is two dimensional figure");
    }
    //default method
    default void print()
    {
        System.out.println("This shape have four sides");
    }

}
class Rectangle implements Shape
{
    int l,b;
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public void area()
    {
        System.out.println("The area of rectangle is :" + (l*b) + " sq. units");
    }

    public static void main(String[] args)
    {
        Shape.show();
        Rectangle rect=new Rectangle(20,30);
        rect.print();
        rect.area();
    }
}
