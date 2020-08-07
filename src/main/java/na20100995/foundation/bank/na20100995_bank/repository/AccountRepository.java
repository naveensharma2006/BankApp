package na20100995.foundation.bank.na20100995_bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import na20100995.foundation.bank.na20100995_bank.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {
	
	@Query(value="SELECT * FROM ACCOUNT",nativeQuery = true)
	public List<Account> getAccounts();

}
