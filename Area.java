class Rectangle
{
static double length,breadth;
Rectangle(double length,double breadth)
{
this.length=length;
this.breadth=breadth;
}
static void area()
{
System.out.println(length*breadth);
}
}
class Square
{
static double side;
Square(double side)
{
this.side=side;
}
static void area()
{
System.out.println(side*side);
}
}
public class Area
{
public static void main(String[] args)
{
Rectangle r=new Rectangle(2.4,3.6);
Square s=new Square(5.7);
Rectangle.area();
Square.area();
}
}