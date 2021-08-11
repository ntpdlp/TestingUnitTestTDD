package bank;

import java.util.Collection;

import bank.domain.Account;
import bank.domain.AccountEntry;
import bank.service.AccountService;
import bank.service.IAccountService;



public class Application {
	public static void main(String[] args) {
		IAccountService accountService = new AccountService();
		// create 2 accounts;
		accountService.createAccount(1263862);
		accountService.createAccount(4253892);
		//use account 1;
		accountService.deposit(1263862, 240);
		accountService.deposit(1263862, 529);
		//use account 2;
		accountService.deposit(4253892, 12450);

		
		Collection<Account> accountlist = accountService.getAllAccounts();
		for (Account account : accountlist) {
			System.out.println("Statement for Account: " + account.getAccountnumber());
			System.out.println("-Date-------------------------"
							+ "-Description------------------"
							+ "-Amount-------------");
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", entry.getDate()
						.toString(), entry.getDescription(), entry.getAmount());
			}
			System.out.println("----------------------------------------"
					+ "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:",
					account.getBalance());
		}
	}

}


