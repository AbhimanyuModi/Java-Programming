// Inter Thread Communication

package multiThread;
public class Account 
{
	long balance;
	public Account(long balance)
	{
		this.balance=balance;
	}
	synchronized void withdraw(int amt)
	{
		if(balance<amt)
		{
			System.out.println("Insufficient balance");
			try {
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			withdraw(amt);
			return ;
		}
		System.out.println("Withdraw successfully Rs "+amt);
		balance=balance-amt;
		System.out.println("Available balance : "+balance);
	}
	synchronized void deposit(int amt)
	{
		balance=balance+amt;
		System.out.println("Deposited successfully");
		System.out.println("Available balance : "+balance);
		notify();
	}
}
