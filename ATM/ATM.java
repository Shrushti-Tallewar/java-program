import java.util.*;
import java.text.*;
class Account
{
	Scanner sc = new Scanner(System.in);
	DecimalFormat df1 = new DecimalFormat("###,##0.00' Rupee'");                  // format
	DecimalFormat df2 = new DecimalFormat("###,##0.00' Dollar'");
	double CB = 2000;
	double SB = 1000;
	private int CN;
	private int pin;
	void setCustomerNumber(int cn)
	{
		CN= cn;
	}
	void setPINNumber(int pin)
	{
		this.pin = pin;
	}
	int getCustomerNumber()
	{
		return CN;
	}
	int getPINNumber()
	{ 
		return pin;
	}
void getCurrentBalance() 
{
	System.out.println("\nCurrent Account Balance:"
+df1.format(CB));
}

void getSavingBalance()
{
	System.out.println("\nSaving Account Balance:"
			+df2.format(SB));
}
void getCurrentWithDrawInput()
{
	System.out.println("\nCurrent Account Balance:"
			+df1.format(CB));
	System.out.print("Enter Withdraw Account");
	double amount = sc.nextDouble();
	if(CB >= amount)
	{
		System.out.println("\nTransaction Succesfull");
		calCurrentWithdraw(amount);   
		System.out.println("\nCurrent Account Balance:"
				+df1.format(CB) + "\n" );                              // output calculations method
	}
	else
	{
		System.out.println("\nInsufficient Balance");
		System.out.println("\nCurrent Account Balance:"
				+df1.format(CB));
	}
}
double  calCurrentWithdraw(double amount) {
	CB = CB - amount;
	return CB;
}
void getCurrentDepositeInput()
{
	System.out.println("\nCurrent Account Balance:"
			+df1.format(CB));
	System.out.print("Enter Deposite Account");
	double amount = sc.nextDouble();
	if(true)
	{
		System.out.println("\nTransaction Succesfull");
		calCurrentDeposit(amount);   
		System.out.println("\nCurrent Account Balance:"
				+df1.format(CB) + "\n" );                              // output calculations method
	}
	else
	{
		System.out.println("\nCurrent Account Balance:"
				+df1.format(CB));
	}
}
double  calCurrentDeposit(double Damount) {
	CB = CB + Damount;
	return CB;
}
	

void getSavingWithDrawInput()
{
	System.out.println("\nSaving Account Balance:"
			+df2.format(SB));
	System.out.print("Enter Withdraw Account:");
	double amount = sc.nextDouble();
	if(SB >= amount)
	{
		System.out.println("\nTransaction Succesfull!!");
		calSavingWithdraw(amount);   
		System.out.println("\nSaving Account Balance:"
				+df2.format(SB) + "\n" );                              // output calculations method
	}
	else
	{
		System.out.println("\nInsufficient Balance");
		System.out.println("\nSaving Account Balance:"
				+df2.format(SB));
	}
}
double  calSavingWithdraw(double Savingamount) {
	SB = SB - Savingamount;
	return Savingamount;
}
void getSavingDepositeInput()
{
	System.out.println("\nSaving Account Balance:"
			+df2.format(SB));
	System.out.print("Enter Deposit Account:");
	double DDamount = sc.nextDouble();
	if(true)
	{
		System.out.println("\nTransaction Succesfull");
		calSavingDeposit(DDamount);   
		System.out.println("\nSaving Account Balance:"
				+df2.format(SB) + "\n" );                              // output calculations method
	}
	else
	{
		System.out.println("\nSaving Account Balance:"
				+df2.format(SB));
	}
}
double  calSavingDeposit(double DDamount) {
	SB = SB + DDamount;
	return SB;
}

}
class OptionMenu extends Account
{
	Scanner sc = new Scanner(System.in);
	HashMap <Integer,Integer>data = new HashMap();
	void getLogin()
	{
	do
	{
	  try
	   {
		data.put(11111,111);
		data.put(11112,564);
		data.put(11113,123);
		data.put(11114,222);
		data.put(11115,111);
		
		System.out.println("Welcome to the ATM");
		System.out.print("\nEnter Customer Number :");
		setCustomerNumber(sc.nextInt());
		
		System.out.print("Enter PIN Number:");
		setPINNumber(sc.nextInt());
		
		int P = getCustomerNumber();
		int Q = getPINNumber();
		
		if(data.containsKey(P)&& data.get(P)== Q)
		{
			getAccountType();
		}
		else
		{
			System.out.println("Wrong ID or PIN");
			System.err.println("\n wrong customer number or pin number");
		}
	}
	catch(InputMismatchException e)
	{
		System.out.println("please enter only number.");
		System.out.println("character and symbols are not allowed");
		sc.next();                                                                 //buffer
	}
}
while(true);
	}
void getAccountType()
{
	System.out.println("choice 1 : Current Account");
	System.out.println("choice 2 : Saving Account");
	System.out.println("choice 3 : Exit ");
	System.out.print("\n choice:");
	
	int ch = sc.nextInt();
	switch(ch)
	{
	case 1 :
		getCurrent();
		break;
	case 2 :
		getSaving();
		break ;
	case 3:
		System.out.println("\n THANK YOU FOR VISITING");
		System.out.println("VISIT AGAIN\n");
		break;
		default :
			System.out.println("\n Invalid Choice");
			System.out.println("enter valid choice \n");
			getAccountType();
			break;
	 }
	}
void getCurrent()
{
	System.out.println("\nCurrent Account");
	System.out.println("\nChoice 1 : Balance Enquiry");
	System.out.println("\nChoice 2 : Withdraw Money");
	System.out.println("\nChoice 3 : Deposit Money");
	System.out.println("\nChoice 4 : Exit");
	System.out.print("\nChoice  : ");
	int ch = sc.nextInt();
	switch (ch)
	{
	case 1 :
		getCurrentBalance();
		break ;
	case 2 :
		getCurrentWithDrawInput();
		getAccountType();
		break;
	case 3 :
		getCurrentDepositeInput();
		break;
	case 4 :
		System.out.println("\n THANK YOU FOR VISITING");
		System.out.println("VISIT AGAIN\n");
		break ;
	default :
		System.err.println("\n Invalid Choice");
		System.out.println("enter valid choice \n");
		getCurrent();
		break;
	}
}
void getSaving()
{
	System.out.println("\nSaving Account");
	System.out.println("\nChoice 1 : Balance Enquiry");
	System.out.println("\nChoice 2 : Withdraw Money");
	System.out.println("\nChoice 3 : Deposit Money");
	System.out.println("\nChoice 4 : Exit");
	System.out.print("\nChoice  : ");
	int ch = sc.nextInt();
	switch (ch)
	{
	case 1 :
		getSavingBalance();
		break ;
	case 2 :
		getSavingWithDrawInput();
		getAccountType();
		break;
	case 3 :
		getSavingDepositeInput();
		break;
	case 4 :
		System.out.println("\n THANK YOU FOR VISITING");
		System.out.println("VISIT AGAIN\n");
		break ;
	default :
		System.err.println("\n Invalid Choice");
		System.out.println("enter valid choice \n");
		getSaving();
		break;
	}
 }
}
	
public class ATM {

	public static void main(String[] args) 
	{
		OptionMenu obj = new OptionMenu();
		//obj.getLogin();
		obj.getAccountType();

	}
}



