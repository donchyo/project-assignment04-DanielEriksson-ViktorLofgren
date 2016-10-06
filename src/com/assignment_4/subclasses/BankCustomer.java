package com.assignment_4.subclasses;
import com.assignment_4.superclasses.*;
import java.util.ArrayList;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;
/**
 * 
 * @author Daniel Eriksson, Viktor Löfgren
 *
 */
public class BankCustomer extends Human{
	
	private ArrayList<BankAccount> customerAccounts = new 
			ArrayList<BankAccount>();
	/**
	 * Bank customer, takes a string name and int age to create a BankCustomer
	 * @param name
	 * @param age
	 */
	public BankCustomer(String name, int age) {
		super(name, age);
	}
	/**
	 * getter customer accounts
	 * @return
	 */
	public ArrayList<BankAccount> getCustomerAccounts(){
		return customerAccounts;
	}
	/**
	 * setter customeraccounts
	 * @param customerAccounts
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	/**
	 * 
	 * adds a object bank account to the arraylist of bank accounts
	 * @param bankAccount
	 */
	public void addAccount(BankAccount bankAccount){
		customerAccounts.add(bankAccount);
	}
	/**
	 * checks if the accountname entered exists in the arraylist of accounts, then deposits money into the account.
	 * @param accountName
	 * @param amount
	 */
	public void depositToAccount(String accountName, double amount){
		for (int i = 0; i < customerAccounts.size(); i++){
			if(customerAccounts.get(i).getAccountNumber().equals(accountName)){
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}
	/**
	 * uses withdrawMoney to withdraw money from an accountname if it exists in the arraylist with accounts
	 * @param accountName
	 * @param amount
	 */
	public void withdrawMoneyFromAccount(String accountName, double amount){
		for (int i = 0; i < customerAccounts.size(); i++){
			if(customerAccounts.get(i).getAccountNumber().equals(accountName)){
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}
	/**
	 * toSting, will return a string with a customers, name, age aswell as their bank accounts with all the info within.
	 */
    public String toString() {
        String result = "Customer: "+getName()+", Age: "+getAge()+"\n";
        for (int i = 0; i < customerAccounts.size(); i++) {
            result = result + customerAccounts.get(i).toString()+"\n";
        }
        return result;
       
    }	 
			
	
		
				
	
	

}