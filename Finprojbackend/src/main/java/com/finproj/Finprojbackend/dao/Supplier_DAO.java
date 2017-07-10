package com.finproj.Finprojbackend.dao;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finproj.Finprojbackend.model.Category;
import com.finproj.Finprojbackend.model.Supplier;
@Repository("supplierDAO")
public class Supplier_DAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public Supplier_DAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
@Transactional
	public void insertUpdateSupplier(Supplier supplier)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(supplier);
	}
	
	public Supplier getSupplier(int supid)
	{
		Session session=sessionFactory.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class,supid);
		session.close();
		return supplier;
	}
	
	@Transactional
	public void deleteSupplier(Supplier supplier)
	{
		sessionFactory.getCurrentSession().delete(supplier);
	}
	
	public List<Supplier> getSupplierDetails()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Supplier");
		List<Supplier> list=query.list();
		session.close();
		return list;
	}

}
