package com.qcm.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;

import com.qcm.dao.BaseDao;

public class BaseDaoHibernate4<T> implements BaseDao<T> {
	private SessionFactory sessionFactory;



	@SuppressWarnings("unchecked")
	public T get(Class<T> entityClazz, Serializable id) {
		// TODO Auto-generated method stub
		return (T) getSessionFactory().openSession().get(entityClazz, id);
		

	}

	public Serializable save(T entity) {
		// TODO Auto-generated method stub
		return getSessionFactory().getCurrentSession().save(entity);
	}

	public void update(T entity) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().saveOrUpdate(entity);

	}

	public void delete(T entity) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().delete(entity);
	}

	public void delete(Class<T> entityClazz, Serializable id) {
		// TODO Auto-generated method stub
		getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"delete " + entityClazz.getSimpleName()
								+ " en where en.id= ?0 ").setParameter("0", id)
				.executeUpdate();
	}

	public List<T> findall(Class<T> entityClazz) {
		// TODO Auto-generated method stub
		return null;
	}

	public long findCount(Class<T> entityClazz) {
		// TODO Auto-generated method stub
		return 0;
	}

	// getter and setter
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
