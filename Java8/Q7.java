package Java8;

// Override the default method of the interface.

import java.awt.*;

interface Area
{
    final float pi=3.14f;
    //default method
    default void print()
    {
        System.out.println("It is a two dimensional figure");
    }
    void area();

}
class Circle implements Area
{
    float rad;
    Circle(float rad)
    {
        this.rad=rad;
    }
    public void area()
    {
        System.out.println("The area of circle is :" + (pi*rad*rad) + " sq. units");
    }
@Override
    public void print()
    {
        System.out.println("the circle is 2D object");
    }

    public static void main(String[] args)
    {
        Circle c=new Circle(3.0f);
        c.print();
        c.area();
    }
}

