package na20100995.foundation.bank.na20100995_bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import na20100995.foundation.bank.na20100995_bank.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	@Query(value = "SELECT * FROM CUSTOMER", nativeQuery = true)
	public List<Customer> getCustomers();

}
