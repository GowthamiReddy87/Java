class MYBank implements ATM,CDM
{
static int mybalance=10000;
public void showMyBalance()
{
System.out.println("balance:"+this.mybalance);
}
public void giveMyMoney(int cash)
{
}
public void depositCash(int cash)
{
}
public static void main(String[] args)
{
ATM a1=new MYBank();
a1.showMyBalance(); 
}
}