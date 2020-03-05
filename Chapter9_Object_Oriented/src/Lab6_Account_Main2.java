import java.util.Date;

public class Lab6_Account_Main2 {
	public static void main(String[] args) {
		account account1 = new account(1122,2000);
		account1.setAnnualInterestRate(0.42);
		account1.withdraw(2500);
		account1.deposit(3000);
		System.out.println(account1.getBalance());	
	}}


class account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
   account() {
		   dateCreated = new Date();
		   id = 0;
		   balance =0;
		   }

   account(double newbalance, int newid) {
	   balance = newbalance;
	   id = newid;
	   dateCreated = new Date();
	   }

   	void setAnnualInterestRate(double newAnnualInterestRate) {
   		annualInterestRate = newAnnualInterestRate;
   	}
   	
   	void setID(int newID) {
   		id = newID;
   	}
   	
   	
   	void setBalance(double newbalance) {
   		balance = newbalance;
   	}
   	
   	public double getBalance() {
   		return balance;
   	}
   	
   	void withdraw(double amount) {
   		balance -=amount;
   	}
   	
   	void deposit(double amount) {
   		balance += amount;
   	}
   	
   	public Date getDateCreated() {
   		return dateCreated;
   	}
   	public double getMonthlyInterestRate () {
		    return balance*annualInterestRate/1200;
		  }

	
}


