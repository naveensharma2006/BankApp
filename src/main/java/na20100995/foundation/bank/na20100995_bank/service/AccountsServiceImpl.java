package na20100995.foundation.bank.na20100995_bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import na20100995.foundation.bank.na20100995_bank.entity.Account;

@Service
public class AccountsServiceImpl implements AccountsService {

	@Override
	public List<Account> getAllAccounts() {

		Account account = new Account();
		account.setAccountId(1);
		account.setAccountType("Savings");
		account.setBalance(123);
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(account);
		return accounts;
	}

	@Override
	public Account getAccountById(int id) {
		Account account = new Account();
		account.setAccountId(id);
		account.setAccountType("Current");
		account.setBalance(1234);

		return account;
	}

}
