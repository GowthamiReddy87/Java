class Second
{
static void fun2(int n)
{
int i=1;
while(i<=n)
{
System.out.print("i="+i+"\t");
i=i+1;
}
}
}
public class Demo{
public static void main(String args[])
{
Second.fun2(10);
}
}