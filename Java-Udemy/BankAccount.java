package Secion5;
public class Account {
	public Account()
	{
		System.out.println("Empty COns");
	}

		public String accountNumber;
		public double balance;
		public String customerName;
		public String emailId;
		public String number;
		
		public String getAccountNumber()
		{
			return this.accountNumber;
		}
		
		public void setAccountNumber(String accno)
		{
			this.accountNumber = accno;
		}
		public double getBalance()
		{
			return this.balance;
		}
		public void setBalance(double balance)
		{
			this.balance = balance;
		}
		public String getCustomerName()
		{
			return this.customerName;
		}
		public void setCustomerName(String custName)
		{
			this.customerName = custName;
		}
		public String getEmailId()
		{
			return this.emailId;
		}
		public void setEmailId(String emailId)
		{
			this.emailId = emailId;
		}
		public String getNumber()
		{
			return this.number;
		}
		public void setNumber(String number)
		{
			this.number = number;
		}
		public void deposit(double depositAmount)
		{
			this.balance += depositAmount;
			System.out.println(depositAmount + " deposited. Current balace is " + this.balance );
		}
		public void withdrawal(double withdrawalAmount)
		{
			if(balance - withdrawalAmount < 0)
			{
				System.out.println("WIthdraw cannot be done due to less amount");
			}
			else
			{
				this.balance -= withdrawalAmount;
				System.out.println("Remaining Balance :" + this.balance + ". " + withdrawalAmount + 
						"processed");
			}
		}
		
}


public class Main {
	public static void main(String args[])
	{
	Account acc1 = new Account();
	acc1.deposit(1000);
	acc1.withdrawal(1100);
	
	acc1.setAccountNumber("Account1");
	acc1.setBalance(5000);
	acc1.setCustomerName("Keyur");
	acc1.setEmailId("rockstar@gmail.com");
	acc1.setNumber("0894749993");
	}
}
