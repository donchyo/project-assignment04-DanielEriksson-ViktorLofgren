package com.assignment_4.superclasses;
import java.util.UUID;
import com.assignment_4.interfaces.BankOperations;
/**
 * 
 * @author Daniel Eriksson, Viktor Löfgren
 *
 */


public class BankAccount implements BankOperations{
	private String accountNumber = "";
	private double balance = 0;
	private String accountType = "";
	/**
	 * set accountnumber to a random hex number with 
	 * 6 characters, converts it to a sting. it also sets the balance to 0 and sets the account type to Bank account
	 */
	public BankAccount() {	
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank account";
	}	
	/**
	 * getter accountnumber
	 * @return
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * setter accountnumber
	 * @param accountNumber
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * getter getBalance
	 * @return
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * setter getBalance
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * getter getAccountType
	 * @return
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * setter accounttype
	 * @param accountType
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * takes a double and tries to withdraw that amount from balance, if you try and enter a negative double you will get an error "You can not withdraw a negative value!"
	 */
	public void withdrawMoney(double amount) {
		if (amount>=0){
			setBalance(this.balance - amount);
		}else{
			System.out.println("You can not withdraw a negative value!");
		}
				
	}
	/**
	 * takes a double and tries to deposit that amount into balance, if you try and enter a negative double you will get an error "You can not deposit a negative value!"
	 */
	public void depositMoney(double amount) {
		if (amount>=0){
			setBalance(getBalance() + amount);
		}else{
			System.out.println("You can not deposit a negative value!");
		}
		
	}
	/**
	 * returns a string with account number, balance and accounttype
	 */
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", accountType=" + accountType + "]";
	}	
	
	
	
	
	

}