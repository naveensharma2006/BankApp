package na20100995.foundation.bank.na20100995_bank.service;

import java.util.List;

import na20100995.foundation.bank.na20100995_bank.entity.Account;

/**
 * @author naveensharma
 *
 */
public interface AccountService {

	/**
	 * Method for get all accounts
	 * 
	 * @return
	 */
	public List<Account> getAllAccounts();

	/**
	 * Method for get account by id
	 * 
	 * @param id
	 * @return
	 */
	public Account getAccountById(int id);

}
