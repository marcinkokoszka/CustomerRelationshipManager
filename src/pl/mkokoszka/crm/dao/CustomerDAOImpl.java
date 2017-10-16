package pl.mkokoszka.crm.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import pl.mkokoszka.crm.entity.Customer;

@Repository
public class CustomerDAOImpl extends BaseDaoImpl<Customer> implements CustomerDAO {
			
	@Override
	public List<Customer> getCustomers() {
		
		Query<Customer> theQuery = createQuery("from Customer order by lastName", Customer.class);
		
		List<Customer> customers = theQuery.getResultList();
						
		return customers;
	}
}






