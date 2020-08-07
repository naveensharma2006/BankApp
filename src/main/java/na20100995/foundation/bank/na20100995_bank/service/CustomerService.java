package na20100995.foundation.bank.na20100995_bank.service;

import java.util.List;

import na20100995.foundation.bank.na20100995_bank.entity.Customer;

/**
 * @author naveensharma
 *
 */
public interface CustomerService {

	/**
	 * Method for get all accounts
	 * 
	 * @return
	 */
	public List<Customer> getAllCustomers();

	/**
	 * Method for get account by id
	 * 
	 * @param id
	 * @return
	 */
	public Customer getCustomerById(int id);

}
