package pl.mkokoszka.crm.dao;

import java.util.List;

import pl.mkokoszka.crm.entity.Customer;

public interface CustomerDAO extends BaseDao<Customer>{

	public List<Customer> getCustomers();
}
