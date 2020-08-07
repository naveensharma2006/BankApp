package na20100995.foundation.bank.na20100995_bank.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import na20100995.foundation.bank.na20100995_bank.entity.Customer;
import na20100995.foundation.bank.na20100995_bank.repository.CustomerRepository;

@Component
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> getCustomers() {
		List<Customer> customers = customerRepository.getCustomers();
		return customers;
	}

	@Override
	public Customer getCustomerByID(int id) {
		Optional<Customer> account = customerRepository.findById(id);
		return account.get();
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

}
