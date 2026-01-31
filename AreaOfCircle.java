class Area
{
double add(double radius)
{
return Math.PI*radius*radius;
}
}
public class AreaOfCircle
{
public static void main(String[] args)
{
Area s1=new Area();
System.out.println(s1.add(5));
}
}