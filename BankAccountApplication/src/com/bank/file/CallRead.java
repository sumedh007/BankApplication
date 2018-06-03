package com.bank.file;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.bank.accounts.AccountBean;
import com.bank.accounts.AccountListGenerator;
import com.bank.accounts.CheckingAccount;
import com.bank.accounts.SavingsAccount;

public class CallRead {

	public static void main(String[] args) {
		AccountListGenerator a = new AccountListGenerator();
		ArrayList<AccountBean> list=a.read();
		
		Iterator it = list.iterator();
		System.out.println("Displaying All Accounts>>>>>>");
		while (it.hasNext()){
			
			System.out.println(it.next());
			
		}
		
		System.out.println("Displaying Checking Accounts>>>>>>");
		
		for(AccountBean li : list ){
			if (li instanceof CheckingAccount){
				System.out.println(li);
			}
		}
		
		System.out.println("Displaying Savings Accounts>>>>>>");
		for(AccountBean li : list ){
			if (li instanceof SavingsAccount){
				System.out.println(li);
			}
		}

	}

}
