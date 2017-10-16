package pl.mkokoszka.crm.dao;

public interface BaseDao <Entity> {

	void save(Entity entity);
	Entity get(Class<Entity> entityClass, int id);
	void delete(Class<Entity> entityClass, int id);
}
