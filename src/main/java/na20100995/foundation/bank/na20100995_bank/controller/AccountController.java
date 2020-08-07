package na20100995.foundation.bank.na20100995_bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import na20100995.foundation.bank.na20100995_bank.entity.Account;
import na20100995.foundation.bank.na20100995_bank.service.AccountsService;

/**
 * @author naveensharma
 *
 */
@RestController
public class AccountController {
	
	@Autowired
	AccountsService accountService;


	/** Gets all accounts
	 * @return
	 */
	@GetMapping("accounts")
	public List<Account> getAllAccounts() {
		List<Account> accounts;
		
		accounts=accountService.getAllAccounts();

		return accounts;

	}
	
	/** Gets account  by id
	 * @return
	 */
	@GetMapping("accounts/{id}")
	public Account getAllAccounts(@PathVariable int id) {
		Account account = null;
		account = accountService.getAccountById(id);
		return account;

	}
}
