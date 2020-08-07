package na20100995.foundation.bank.na20100995_bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import na20100995.foundation.bank.na20100995_bank.dao.CustomerDAO;
import na20100995.foundation.bank.na20100995_bank.entity.Customer;

/**
 * @author naveensharma
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customersDAO;

	@Override
	public List<Customer> getAllCustomers() {

		List<Customer> Customers = customersDAO.getCustomers();
		return Customers;
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer Customer = customersDAO.getCustomerByID(id);
		return Customer;
	}

}
