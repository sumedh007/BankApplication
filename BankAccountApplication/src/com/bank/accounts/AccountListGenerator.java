package com.bank.accounts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.bank.file.CallRead;
import com.bank.file.ReadFile;

public class AccountListGenerator {

	ArrayList<AccountBean> accountlist = new ArrayList<>();
	static int unique5=00001;
	AccountBean account = null;
	String details;
	String name;
	int ssn;
	String accountType;
	int initialBalance;

	public ArrayList<AccountBean> read() {
		
		
		File file = new File("C:\\Users\\susardal\\Downloads\\NewBankAccounts (1).txt");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((details = bufferedReader.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(details, ",");
				//AccountBean accountBean = new AccountBean();
				while (st.hasMoreTokens()) {
					/*accountBean.setName(st.nextToken());
					accountBean.setSsn(Integer.parseInt(st.nextToken()));
					accountBean.setAccountType(st.nextToken());
					accountBean.setInitialBalance(Integer.parseInt(st.nextToken()));
					accountlist.add(accountBean);*/
					name=st.nextToken();
					ssn=Integer.parseInt(st.nextToken());
					accountType=st.nextToken();
					initialBalance=Integer.parseInt(st.nextToken());
					
					
					if (accountType.equals("Checking")){
						account = new CheckingAccount();
						
					}
					else{
						account=new SavingsAccount();
					}
					account.setName(name);
					account.setSsn(ssn);
					account.setInitialBalance(initialBalance);
					account.setAccountType(accountType);
					account.setAccountNumber(generateAccountNumber());
					accountlist.add(account);
					
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accountlist;
	}
	
	public long generateAccountNumber() {
		String accno = "";
		StringBuffer sb = new StringBuffer();
		int random = (int) (Math.random() * 1000 - 1);
		String ssnString = String.valueOf(ssn);
		System.out.println(ssnString.length());
		String s1=ssnString.substring(7);
		if (accountType.equals("Checking")) {
			sb.append("2") ;
			sb.append(ssnString);
			sb.append(unique5);
			sb.append(random);

		}

		/*else {
			accno = "1" + ssnString.substring(7) + String.valueOf(unique5) + String.valueOf(random);
		}
		*/
		unique5++;
		return Long.parseLong(accno);

	}
}
