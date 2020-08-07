package na20100995.foundation.bank.na20100995_bank.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import na20100995.foundation.bank.na20100995_bank.entity.Account;
import na20100995.foundation.bank.na20100995_bank.repository.AccountRepository;

@Component
public class AccountsDAOImpl implements AccountsDAO {

	@Autowired
	AccountRepository accountRepository;

	@Override
	public List<Account> getAccounts() {
		List<Account> accounts = accountRepository.getAccounts();
		return accounts;
	}

	@Override
	public Account getAccountbyId(int id) {
		Optional<Account> account = accountRepository.findById(id);
		return account.get();
	}

	@Override
	public String transferFund() {
		// TODO Auto-generated method stub
		return null;
	}

}
