package na20100995.foundation.bank.na20100995_bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import na20100995.foundation.bank.na20100995_bank.entity.Customer;
import na20100995.foundation.bank.na20100995_bank.service.CustomerService;

/**
 * @author naveensharma
 *
 */
@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	/**
	 * Gets all customers
	 * 
	 * @return
	 */
	@GetMapping("customers")
	public List<Customer> getAllCustomers() {
		List<Customer> accounts;

		accounts = customerService.getAllCustomers();

		return accounts;

	}

	/**
	 * Gets customer by id
	 * 
	 * @return
	 */
	@GetMapping("customers/{id}")
	public Customer getAllAccounts(@PathVariable int id) {
		Customer customer = null;
		customer = customerService.getCustomerById(id);
		return customer;

	}
}
