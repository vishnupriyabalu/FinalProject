package com.finproj.Finprojbackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finproj.Finprojbackend.model.Cart;


@Repository("cartDAO")
public class CartDAO {
@Autowired
SessionFactory sessionFactory;

public CartDAO(SessionFactory sessionFactory) {
	this.sessionFactory=sessionFactory;
}
@Transactional
public void addtocart(Cart cartitem){
	sessionFactory.getCurrentSession().saveOrUpdate(cartitem);
}

public  List<Cart> getCartItem(String username){
	Session session=sessionFactory.openSession();
	Query query=session.createQuery("from Cart where username=:username and status='N'"); 
	query.setParameter("username",username);
			@SuppressWarnings("unChecked")
			List<Cart> list=query.list();
			return list;
}
	@Transactional
	public void deletecartitem(Cart cart)
	{
		sessionFactory.getCurrentSession().delete(cart);
	}
	
	public Cart getCartItem(int citemid) {
		Session session=sessionFactory.openSession();
		Cart cart=(Cart)session.get(Cart.class, citemid);
		return cart;
	}
	@Transactional
	public void updatecartitem(Cart cart)
	{
		sessionFactory.getCurrentSession().update(cart);
		}
		
}
