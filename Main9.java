class Thread1 implements Runnable
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(Thread.currentThread().getName()+i);
}
}
}
class Main9
{
public static void main(String[] args)
{
Runnable r1 = new Thread1();
Thread t1 = new Thread(r1);
Runnable r2 = new Thread1();
Thread t2 = new Thread(r2);
t1.start();
t2.start();
}
}
