class Outer1
{
int x=100;
void createInner()
{
Inner i=new Inner();
i.add(12,23);
}
class Inner
{
int a=50;4
void add(int a,int b)
{
System.out.println(a+b);
}
}
public static void main(String[] args)
{
Outer1 O=new Outer1();
O.createInner();
}
}