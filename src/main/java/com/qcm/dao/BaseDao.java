package com.qcm.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	/**
	 * get the instance according to the primary key
	 * */
	T get(Class<T> entityClazz, Serializable id);

	/**
	 * save the entity and get the id
	 * */
	Serializable save(T entity);

	/**
	 * update the entity
	 * */
	void update(T entity);

	/**
	 * delete the entity
	 * */
	void delete(T entity);

	/**
	 * delete the entity according the id
	 * */
	void delete(Class<T> entityClazz, Serializable id);

	/**
	 * get all the entity
	 * */
	List<T> findall(Class<T> entityClazz);

	/**
	 * count the entity
	 * */
	long findCount(Class<T> entityClazz);
}
