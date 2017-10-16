package pl.mkokoszka.crm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDaoImpl<Entity> implements BaseDao<Entity> {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void save(Entity entity) {
		
		Session currentSession = getCurrentSession();
		
		currentSession.saveOrUpdate(entity);
	}
	
	public Query<Entity> createQuery(String sql, Class<Entity> c){
		// get the current hibernate session
		Session currentSession = getCurrentSession();
				
		// create a query
		Query<Entity> theQuery = 
				currentSession.createQuery(sql, c);

		return theQuery;
	}
	
	public Entity get(Class<Entity> entityClass, int id) {

		Session currentSession = getCurrentSession();

		return currentSession.get(entityClass, id);
	}
	
	public void delete(Class<Entity> entityClass, int id) {
		
		Session currentSession = getCurrentSession();
		
		Entity entity = currentSession.load(entityClass, id);
		
		currentSession.delete(entity);
	}
}
