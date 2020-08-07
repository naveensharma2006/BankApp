package na20100995.foundation.bank.na20100995_bank.dao;

import java.util.List;

import na20100995.foundation.bank.na20100995_bank.entity.Account;

/**
 * DAO for Accounts
 * 
 * @author naveensharma
 *
 */
public interface AccountsDAO {

	public List<Account> getAccounts();

	public Account getAccountbyId(int id);

	public String transferFund();

}
