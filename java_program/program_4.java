package java_program;

 class BankAccount{
	 protected double balance;
	 BankAccount(double balance){
	 this.balance = balance;}
	 
	 void deposit(double amount) {
		 balance +=amount;
		 
		 System.out.println("Deposited:"+amount);
	 }
	 void withdraw(double amount) {
		 if (balance >= amount) {
			 balance -=amount; 
			 System.out.println("Withdraw:"+amount);
			 }
		 else{
			 System.out.println("not sufficient balance");
		 } 
	 } 
 }
public class program_4 {
	public static void main (String[]args) {
		BankAccount ba = new BankAccount(1000);
		ba.deposit(2000);
		ba.withdraw(5000);
	}

}
