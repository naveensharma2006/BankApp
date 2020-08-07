package na20100995.foundation.bank.na20100995_bank.dao;

import java.util.List;

import na20100995.foundation.bank.na20100995_bank.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public Customer getCustomerByID();

	public void updateCustomer(Customer customer);

	public void createCustomer(Customer customer);

}
