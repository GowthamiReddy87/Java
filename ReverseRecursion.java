public class ReverseRecursion
{
public static int sum(int n,int rev) 
{
if(n==0)
return rev;
return sum(n/10,rev*10+(n%10));
}
public static boolean palin(int n,int rev)
{
if(n==rev)
{
return true;
}
else
{
return false;
}
}
public static void main(String[] args)
{
int n=121;
sum(n,0);
System.out.println(palin(n,0));
}
}