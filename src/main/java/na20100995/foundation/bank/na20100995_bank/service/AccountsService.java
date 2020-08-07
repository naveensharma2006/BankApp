package na20100995.foundation.bank.na20100995_bank.service;

import java.util.List;
import na20100995.foundation.bank.na20100995_bank.entity.Account;

/**
 * @author naveensharma
 *
 */
public interface AccountsService {

	public List<Account> getAllAccounts();
	
	public Account getAccountById(int id);

}
