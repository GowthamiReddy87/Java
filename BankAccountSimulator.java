class BankAccount
{
double balance;
BankAccount(double balance)
{
this.balance=balance;
}
void deposit(double money)
{
balance +=money;
System.out.println("money deposited rupees "+money);
}
void withdraw(double cash)
{
if(balance>=cash)
{
balance -=cash;
System.out.println("money is withdrawn of rupees "+cash);
}
else
{
System.out.println("money is not enough");
}
}
}
public class BankAccountSimulator
{
public static void main(String[] args)
{
BankAccount ba=new BankAccount(1000);
ba.deposit(400);
ba.withdraw(200);
}
}

