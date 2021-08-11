package bank.service;

import java.util.Collection;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;

	
	public AccountService(){
		accountDAO=new AccountDAO();
	}
	
	

	public AccountService(IAccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}



	public Account createAccount(long accountNumber) {
		Account account = new Account(accountNumber);
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}

}
