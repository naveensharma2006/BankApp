package na20100995.foundation.bank.na20100995_bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import na20100995.foundation.bank.na20100995_bank.dao.AccountsDAO;
import na20100995.foundation.bank.na20100995_bank.entity.Account;

/**
 * @author naveensharma
 *
 */
@Service
public class AccountsServiceImpl implements AccountsService {

	@Autowired
	AccountsDAO accountsDAO;

	@Override
	public List<Account> getAllAccounts() {

		List<Account> accounts = accountsDAO.getAccounts();
		return accounts;
	}

	@Override
	public Account getAccountById(int id) {
		Account account = accountsDAO.getAccountbyId(id);
		return account;
	}

}
