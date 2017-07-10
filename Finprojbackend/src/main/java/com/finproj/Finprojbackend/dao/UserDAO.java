package com.finproj.Finprojbackend.dao;
	import java.util.List;
	import javax.transaction.Transactional;
	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

import com.finproj.Finprojbackend.model.User;


	

	@Repository("userDAO")
	public class UserDAO {

		@Autowired
		SessionFactory sessionFactory;
		
		public UserDAO(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}
		
	@Transactional
		public void insertUpdateUser(User user)
		{
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(user);
		}
		
		public User getUser(String username)
		{
			Session session=sessionFactory.openSession();
			User user=(User)session.get(User.class,username);
			session.close();
			return user;
		}
		@Transactional
		public boolean isValidUser(String username, String password) {
			System.out.println("dao impl");
			String hql ="from User where username= '" + username + "' and " + " password ='" + password + "'";
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			@SuppressWarnings("unchecked")
			List<User> list = (List<User>) query.list();
			if(list != null && !list.isEmpty())
			{
			
				return true;
			}
			return false;

		}
		@Transactional
		public void deleteUser(User user)
		{
			sessionFactory.getCurrentSession().delete(user);
		}
		
		public List<User> getUserDetails()
		{
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from User");
			List<User> list=query.list();
			session.close();
			return list;
		}
		
	}



