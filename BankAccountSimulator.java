class BankAccount
{
String name;
double balance;
BankAccount(String name,double balance)
{
this.name=name;
this.balance=balance;
System.out.println("account created on"+name);
}
void deposit(double money)
{
balance +=money;
System.out.println("money deposited rupees"+money);
}
void withdraw(double cash)
{
if(balance<=cash)
{
balance -=cash;
System.out.println("money is withdrawn of rupees"+cash);
}
else
{
System.out.println("money is not enough");
}
}
void display()
{
System.out.println("name is"+name+",balance is"+balance);
}
}
public class BankAccountSimulator
{
public static void main(String[] args)
{
BankAccount ba=new BankAccount("Gowthami",1000000);
ba.deposit(400);
ba.withdraw(200);
ba.display();
}
}

