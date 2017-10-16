package pl.mkokoszka.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.mkokoszka.crm.dao.CustomerDAO;
import pl.mkokoszka.crm.entity.Customer;

@Service
public class CustomerServiceImpl extends BaseService implements CustomerService {

	@Autowired
	private CustomerDAO customerDao;
	
	@Override
	public List<Customer> getCustomers() {

		return customerDao.getCustomers();
	}

	@Override
	public void saveCustomer(Customer customer) {

		customerDao.save(customer);
	}

	@Override
	public Customer getCustomer(int theId) {
		
		return customerDao.get(Customer.class, theId);
	}

	@Override
	public void deleteCustomer(int id) {
		
		customerDao.delete(Customer.class, id);
	}

}
