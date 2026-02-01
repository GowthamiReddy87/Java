import java.util.Scanner;
class Main
{
void isEven(int n)
{
if(n%2==0)
{
System.out.println(n+" is even");
}
else{
System.out.println(n+" is odd");
}
}
}
public class EvenOdd
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
int a=sc.nextInt();
Main m1=new Main();
m1.isEven(a);
}
}
